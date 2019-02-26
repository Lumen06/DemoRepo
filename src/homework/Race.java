package homework;

public enum Race {

    CAUCASOID("Europe, North America, Central Asia"),
    NEGROID("Africa"),
    ETHIOPIAN("Africa and European features"),
    MONGOLOID("Asia"),
    AMERICANONE("North and South America"),;

    String description;

    Race(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
