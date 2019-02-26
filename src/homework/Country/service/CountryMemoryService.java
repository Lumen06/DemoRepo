package homework.Country.service;

import homework.City.City;
import homework.Country.Country;
import homework.Country.CountryMemoryRepo.CountryMemoryRepo;

public class CountryMemoryService {

    private CountryMemoryRepo countryRepo = new CountryMemoryRepo();

    public void addCountry(Country Country) {
        countryRepo.addCountry(Country);
    }

    public Country findCountryById(long id) {
        return countryRepo.findCountryByID(id);
    }

    public void deleteCountry(Country Country) {
        countryRepo.deleteCountry(Country);
    }

    public void deleteCountry(Long id) {
        countryRepo.deleteCountry(id);
    }

    public void printCountrys() {
        countryRepo.printCountries();
    }
    
    public void findCountryByCapital(City capital) {
        countryRepo.findCountryByCapital(capital);
    }

}
