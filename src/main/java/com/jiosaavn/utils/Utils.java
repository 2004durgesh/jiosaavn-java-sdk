package com.jiosaavn.utils;

import com.jiosaavn.models.DownloadLink;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class Utils {
    public static List<DownloadLink> createImageLinks(String link) {
        List<DownloadLink> imageLinks = new ArrayList<>();

        if (link == null || link.isEmpty()) {
            return imageLinks;
        }

        String[] qualities = {"50x50", "150x150", "500x500"};
        String protocolFixedLink = link.replaceFirst("^http://", "https://");

        for (String quality : qualities) {
            String updatedLink = protocolFixedLink.replaceAll("150x150|50x50", quality);

            DownloadLink downloadLink = new DownloadLink();
            downloadLink.quality = quality;
            downloadLink.url = updatedLink;

            imageLinks.add(downloadLink);
        }

        return imageLinks;
    }

    public static List<DownloadLink> createDownloadUrl(String encryptedMediaUrl) {
        List<DownloadLink> downloadUrls = new ArrayList<>();
        if (encryptedMediaUrl == null || encryptedMediaUrl.isEmpty()) {
            return downloadUrls;
        }
        String[][] qualities = {
                {"_12", "12kbps"},
                {"_48", "48kbps"},
                {"_96", "96kbps"},
                {"_160", "160kbps"},
                {"_320", "320kbps"}
        };

        // Key for DES decryption (must be exactly 8 bytes for DES)
        String key = "38346591"; // 8-byte key
        byte[] keyBytes = null;
        try {
            keyBytes = key.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

        // Decode Base64
        byte[] encryptedBytes = Base64.getDecoder().decode(encryptedMediaUrl);

        // Create DES cipher in ECB mode with no padding
        SecretKey secretKey = new SecretKeySpec(keyBytes, "DES");
        Cipher cipher = null;
        String decryptedLink = null;
        try {
            cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            // or use "DES/ECB/PKCS5Padding" if padding was used
            cipher.init(Cipher.DECRYPT_MODE, secretKey);

            // Decrypt
            byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
            decryptedLink = new String(decryptedBytes).trim(); // trim to remove padding bytes
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (NoSuchPaddingException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        } catch (IllegalBlockSizeException e) {
            throw new RuntimeException(e);
        } catch (BadPaddingException e) {
            throw new RuntimeException(e);
        }

        // Create URLs
        for (String[] quality : qualities) {
            String updatedUrl = decryptedLink.replace("_96", quality[0]);
            DownloadLink downloadLink = new DownloadLink();
            downloadLink.quality = quality[1];
            downloadLink.url = updatedUrl;
            downloadUrls.add(downloadLink);
        }

        return downloadUrls;
    }
}
