package HeaderFields;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class HeaderFieldsRetriever {

    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.facebook.com");
        URLConnection connection = url.openConnection();
        Map<String, List<String>> headerFields = connection.getHeaderFields();
        for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println(key + ": " + values);
        }
    }
}

