package enums;

public enum LanguageEnum {
    ARABIC("Arabic"),
    ENGLISH("English"),
    POLISH("Polish"),
    RUSSIAN("Русский");

    private String name;

    LanguageEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
