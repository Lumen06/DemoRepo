package homework.Passport.PassportMemoryRepo;

import homework.ArrayUtils.ArrayUtils;
import homework.Passport.Passport;
import homework.Passport.Passport;

import static homework.Storage.Storage.passports;

public class PassportMemoryRepo {
    
    private int passportIndex = -1;


    public void addPassport(Passport passport) {
        if (passportIndex == passports.length-1) {
            Passport[] newPassports = new Passport[ (int) (passportIndex * 1.5)];
            System.arraycopy(passports, 0, newPassports, 0, passports.length);
            passports = newPassports;
        }
        passportIndex++;
        passports[passportIndex] = passport;

    }



    public Passport findPassportByID(Long id) {
        Integer index = findPassportByIndex(id);
        if (index != null) {
            return passports[index];
        }

        return null;
    }

    public Passport findPassportBySerialAndNumber(int serial, int number) {
        for (int i = 0; i < passports.length; i++) {
            if (passports[i].getSerial() == serial & passports[i].getNumber() == number) {
                return passports[i];
            }
        }
        return null;
    }

    public void deletePassport(Passport passport) {
        Integer index = findPassportByEntity(passport);
        deletePassportByIndex(index);
    }

    public void deletePassport(Long id) {
        Integer index = findPassportByIndex(id);
        deletePassportByIndex(index);
    }

    public void printPassports() {
        for (Passport passport : passports) {
            System.out.println(passport);

        }
    }

    public Integer findPassportByIndex(Long index) {
        for (int i = 0; i < passports.length; i++) {
            if (passports[i].getId().equals(index)) {
                return i;
            }
        }
        return null;

    }

    public Integer findPassportByEntity(Passport passport) {
        for (int i = 0; i<passports.length; i++) {
            if (passports[i].equals(passport)) {
                return i;
            }
        }
        return null;
    }

    public void deletePassportByIndex(int index) {
        ArrayUtils.removeElement(passports, index);
        passportIndex--;
    }
}
