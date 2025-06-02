import com.jiosaavn.JioSaavnClient;
import com.jiosaavn.models.Album;
import com.jiosaavn.utils.JsonUtils;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        JioSaavnClient client = new JioSaavnClient();

        try {
            Album.AlbumModel album = client.albumService.getAlbumById("23241654");
            System.out.println(JsonUtils.toJson(album));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
