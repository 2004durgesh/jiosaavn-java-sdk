import com.jiosaavn.JioSaavnClient;
import com.jiosaavn.models.Search;
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
