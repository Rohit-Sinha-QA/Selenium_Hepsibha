package utils;

import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonUtils {
    private static JSONObject jsonObject;

    static {
        try {
            String content = new String(Files.readAllBytes(Paths.get("src/test/java/data/TestData.json")));
            jsonObject = new JSONObject(content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String get(String key) {
        return jsonObject.getString(key);
    }
}

