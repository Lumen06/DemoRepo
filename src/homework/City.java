package homework;

public class City {

    private String name;
    private long population;
    private boolean isCapital;

    public City(String name, long population, boolean isCapital) {
        this.name = name;
        this.population = population;
        this.isCapital = isCapital;
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
