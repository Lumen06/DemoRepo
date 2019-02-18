package homework;

public class Order {

    private String price;
    private User user;
    private Country[] countries;
    private City[] cities;

    public Order(String price, User user, Country[] countries, City[] cities) {
        this.price = price;
        this.user = user;
        this.countries = countries;
        this.cities = cities;
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

        String ciiesList = "";
        for (City city: cities) {
            ciiesList += city.getName() + " ";
        }

        return "Cтоимость: " + price + "\nЗаказчик " + user.toString() + "\nСтрана(-ы): " + countryList + "\nГород(-а): " + ciiesList;
    }
}
