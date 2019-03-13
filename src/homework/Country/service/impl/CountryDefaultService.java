package homework.Country.service.impl;

import homework.City.Repo.CityRepo.CityRepo;
import homework.City.Repo.impl.CityListMemoryRepo;
import homework.City.domain.City;
import homework.Country.Repo.CountryRepo.CountryRepo;
import homework.Country.domain.Country;
import homework.Country.Repo.impl.CountryArrayMemoryRepo;
import homework.Country.search.CountrySearchCondition;
import homework.Country.service.CounryService.CountryService;

import java.util.List;

public class CountryDefaultService implements CountryService {

    private final CityRepo cityRepo;
    private final CountryRepo countryRepo;

    public CountryDefaultService(CityListMemoryRepo cityRepo, CountryArrayMemoryRepo countryRepo) {
        this.cityRepo = cityRepo;
        this.countryRepo = countryRepo;
    }

    @Override
    public void add(Country country) {
        if (country != null) {
            countryRepo.add(country);
        }
        if (country.getCities() != null) {
            for (City city : country.getCities()) {
                this.cityRepo.add(city);
            }

        }
    }

    @Override
    public void deleteById(Long id) {
        if (id != null) {
            countryRepo.deleteById(id);
        }

    }

    @Override
    public void printAll() {
        countryRepo.printAll();
    }


    @Override
    public Country findById(Long id) {
        if (id != null) {
            return countryRepo.findById(id);
        }
        return null;
    }

    @Override
    public List<Country> search(CountrySearchCondition countrySearchCondition) {
        return countryRepo.search(countrySearchCondition);
    }


    public void delete(Country country) {
        if (country.getId() != null) {
            this.deleteById(country.getId());
        }
    }

    @Override
    public void update(Country country) {
        if (country != null) {
            countryRepo.update(country);
        }
    }
}
