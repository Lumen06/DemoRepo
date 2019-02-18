package homework;

import java.util.Date;

public class Passport {

    private int serial;
    private int number;

    public Passport(int serial, int number) {
        this.serial = serial;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Cерия: " + serial + " Номер: " + number;
    }
}
