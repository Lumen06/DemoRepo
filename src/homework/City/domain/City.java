package homework.City.domain;

import homework.Common.Business.domain.BaseDomain;

public class City extends BaseDomain {


    private String name;
    private long population;
    private boolean isCapital;

    public City(Long id, String name, long population, boolean isCapital) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.isCapital = isCapital;
    }

    public City(String name, long population, boolean isCapital) {
        this.name = name;
        this.population = population;
        this.isCapital = isCapital;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getPopulation() {
        return population;
    }

    public boolean isCapital() {
        return isCapital;
    }

    @Override
    public String toString() {
        String capital = "";
        if (this.isCapital) {
            capital = "да";
        }
        else capital = "нет";

        return "Город: " + name + " Население: " + population + " Является столицей: " + capital;
    }
}
