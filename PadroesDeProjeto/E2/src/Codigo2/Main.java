package Codigo2;

public class Main {

    public static void main(String[] args) {
        Preferences prefs = Preferences.getInstance();
        prefs.setPreference("language", "br");
        prefs.setPreference("theme", "dark");

        System.out.println("Language: " + prefs.getPreference("language"));
        System.out.println("Theme: " + prefs.getPreference("theme"));

        anotherMethod();
    }

    public static void anotherMethod() {
        Preferences prefs = Preferences.getInstance();
        System.out.println("Language from anotherMethod: " + prefs.getPreference("language"));
        System.out.println("Theme from anotherMethod: " + prefs.getPreference("theme"));
    }
}