import com.jiosaavn.JioSaavnClient;
import com.jiosaavn.models.Album;
import com.jiosaavn.models.Playlist;
import com.jiosaavn.models.Search;
import com.jiosaavn.models.Song;
import com.jiosaavn.models.artists.Artist;
import com.jiosaavn.utils.JsonUtils;

import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        JioSaavnClient client = new JioSaavnClient();

        try {
            List<Search.SearchModel> search = client.searchService.search("Ram");
            System.out.println(JsonUtils.toJson(search));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
