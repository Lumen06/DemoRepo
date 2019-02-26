package homework.User;

import homework.Passport.Passport;
import homework.Race;

public class User {

    private Long id;
    private String name;
    private String lastName;
    private Passport passport;
    private Race race;

    public User(Long id, String name, String lastName, Passport passport) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.passport = passport;
    }


    public User(String name, String lastName, Passport passport) {
        this.name = name;
        this.lastName = lastName;
        this.passport = passport;
    }

    public User(Long id, String name, String lastName, Passport passport, Race race) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.passport = passport;
        this.race = race;
    }

    public Long getId() {
        return id;
    }

    public Race getRace() {
        return race;
    }

    public String getName() {
        return name;
    }

    public String getlastName() {
        return lastName;
    }

    public Passport getPassport() {
        return passport;
    }

    @Override
    public String toString() {
        return "Имя: " + name + " Фамилия: " + lastName + " Данные паспорта: " + passport;
    }
}
