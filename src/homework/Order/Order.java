package homework.Order;

import homework.City.City;
import homework.Country.Country;
import homework.User.User;

public class Order {

    private Long id;
    private String price;
    private User user;
    private Country[] countries;
    private City[] cities;

    public Order(Long id, String price, User user, Country[] countries, City[] cities) {
        this.id = id;
        this.price = price;
        this.user = user;
        this.countries = countries;
        this.cities = cities;
    }

    public Order(String price, User user, Country[] countries, City[] cities) {
        this.price = price;
        this.user = user;
        this.countries = countries;
        this.cities = cities;
    }

    public Long getId() {
        return id;
    }

    public String getPrice() {
        return price;
    }

    public User getUser() {
        return user;
    }

    public Country[] getCountries() {
        return countries;
    }

    public City[] getCities() {
        return cities;
    }

    @Override
    public String toString() {

        String countryList = "";
        for (Country country : countries) {
            countryList += country.getCountryName() + " ";
        }

        String citiesList = "";
        for (City city: cities) {
            citiesList += city.getName() + " ";
        }

        return "Cтоимость: " + price + "\nЗаказчик " + user.toString() + "\nСтрана(-ы): " + countryList + "\nГород(-а): " + citiesList;
    }
}
