package homework.Passport;

import java.util.Date;

public class Passport {

    private Long id;
    private int serial;
    private int number;

    public Passport(Long id, int serial, int number) {
        this.id = id;
        this.serial = serial;
        this.number = number;
    }

    public Passport(int serial, int number) {
        this.serial = serial;
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public int getSerial() {
        return serial;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Cерия: " + serial + " Номер: " + number;
    }
}
