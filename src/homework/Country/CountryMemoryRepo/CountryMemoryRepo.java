package homework.Country.CountryMemoryRepo;

import homework.ArrayUtils.ArrayUtils;
import homework.City.City;
import homework.City.CityMemoryRepo.CityMemoryRepo;
import homework.Country.Country;
import static homework.Storage.Storage.countries;

public class CountryMemoryRepo {

    private int countryIndex = -1;
    private CityMemoryRepo cityMemoryRepo = new CityMemoryRepo();

    public void addCountry(Country country) {
        if (countryIndex == countries.length-1) {
            Country[] newCountries = new Country[ (int) (countryIndex * 1.5)];
            System.arraycopy(countries, 0, newCountries, 0, countries.length);
            countries = newCountries;
        }
        countryIndex++;
        countries[countryIndex] = country;

        for (City city: country.getCities()) {
            cityMemoryRepo.addCity(city);
        }
    }



    public Country findCountryByID(Long id) {
        Integer index = findCountryByIndex(id);
        if (index != null) {
            return countries[index];
        }

        return null;
    }

    public Country findCountryByCapital(City capital) {
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].getCapital().getName().toLowerCase().equals(capital.getName().toLowerCase().trim())) {
                return countries[i];
            }
        }
        return null;
    }

    public void deleteCountry(Country country) {
        Integer index = findCountryByEntity(country);
        deleteCountryByIndex(index);
    }

    public void deleteCountry(Long id) {
        Integer index = findCountryByIndex(id);
        deleteCountryByIndex(index);
    }

    public void printCountries() {
        for (Country country : countries) {
            System.out.println(country);

        }
    }

    public Integer findCountryByIndex(Long index) {
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].getId().equals(index)) {
                return i;
            }
        }
        return null;

    }

    public Integer findCountryByEntity(Country country) {
        for (int i = 0; i<countries.length; i++) {
            if (countries[i].equals(country)) {
                return i;
            }
        }
        return null;
    }

    public void deleteCountryByIndex(int index) {
        ArrayUtils.removeElement(countries, index);
        countryIndex--;
    }
}
