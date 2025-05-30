package com.jiosaavn;

import com.jiosaavn.models.artists.Artist;
import com.jiosaavn.services.ArtistService;
import com.jiosaavn.utils.JsonUtils;

import java.io.IOException;
import java.util.List;

public class JioSaavnClient {

    public static void main(String[] args) {
        ArtistService client = new ArtistService();

        try {
            // Test search
            System.out.println("=== Testing Search ===");
            Artist.ArtistModel songByLink = client.getArtistById("-h0RbDzaCqA_",1,50,50);
            System.out.println(JsonUtils.toJson(songByLink));


        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}