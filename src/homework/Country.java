package homework;

public class Country {

    private String countryName;
    private String language;
    private City[] cities;


    public Country(String countryName, String language, City[] cities) {
        this.countryName = countryName;
        this.language = language;
        this.cities = cities;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getLanguage() {
        return language;
    }

    public City[] getCities() {
        return cities;
    }

    @Override
    public String toString() {
        String citiesList = " ";
        for (City city : cities) {
            citiesList += city.getName() + " ";
        }

        return "Страна: " + countryName + " Язык: " + language + " Cписок городов: " + citiesList;
    }
}
