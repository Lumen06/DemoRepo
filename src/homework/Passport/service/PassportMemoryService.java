package homework.Passport.service;

import homework.Passport.Passport;
import homework.Passport.PassportMemoryRepo.PassportMemoryRepo;

public class PassportMemoryService {

    private PassportMemoryRepo passportRepo = new PassportMemoryRepo();

    public void addPassport(Passport passport) {
        passportRepo.addPassport(passport);
    }

    public Passport findPassportById(long id) {
        return passportRepo.findPassportByID(id);
    }

    public void deletePassport(Passport passport) {
        passportRepo.deletePassport(passport);
    }

    public void deletePassport(Long id) {
        passportRepo.deletePassport(id);
    }

    public void printPassports() {
        passportRepo.printPassports();
    }
    public void findPassportBySerialAndNumber(int serial, int number) {
        passportRepo.findPassportBySerialAndNumber(serial, number);
    }

}
