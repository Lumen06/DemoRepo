package homework.Storage;

import homework.City.City;
import homework.Country.Country;
import homework.Order.Order;
import homework.Passport.Passport;
import homework.User.User;

public class Storage {

    private static final int CAPACITY = 5;
    public static City[] cities = new City[CAPACITY];
    public static Country[] countries = new Country[CAPACITY];
    public static Order[] orders = new Order[CAPACITY];
    public static User[] users  = new User[CAPACITY];
    public static Passport[] passports = new Passport[CAPACITY];
}
