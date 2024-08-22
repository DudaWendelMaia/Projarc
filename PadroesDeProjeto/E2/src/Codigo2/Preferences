import java.util.HashMap;
import java.util.Map;

public class Preferences {

    private static Preferences instance;
    private Map<String, String> preferences;

    private Preferences() {
        preferences = new HashMap<>();
        preferences.put("language", "en");
        preferences.put("theme", "light");
    }

    public static Preferences getInstance() {
        if (instance == null) {
            instance = new Preferences();
        }
        return instance;
    }

    public void setPreference(String key, String value) {
        preferences.put(key, value);
    }

    public String getPreference(String key) {
        return preferences.get(key);
    }
}
