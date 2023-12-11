package _3sammenlign_byer;

public class City {
    String name;
    int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String toString() {
        return "City: " + name + " Population: " + population;
    }
}
