package homework.Country.domain;

import homework.City.domain.City;
import homework.Common.Business.domain.BaseDomain;

public class Country extends BaseDomain {

    private String countryName;
    private String language;
    private City[] cities;
    private City capital;


    public Country(String countryName, String language, City[] cities) {
        this.countryName = countryName;
        this.language = language;
        this.cities = cities;
    }


    public Country(Long id, String countryName, String language, City[] cities, City capital) {
        this.id = id;
        this.countryName = countryName;
        this.language = language;
        this.cities = cities;
        this.capital = capital;
    }

    public City getCapital() {
        return capital;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public Long getId() {
        return id;
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
