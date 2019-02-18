package homework;

public class User {

    private String name;
    private String lastname;
    private Passport passport;

    public User(String name, String lastname, Passport passport) {
        this.name = name;
        this.lastname = lastname;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Passport getPassport() {
        return passport;
    }

    @Override
    public String toString() {
        return "Имя: " + name + " Фамилия: " + lastname + " Данные паспорта: " + passport;
    }
}
