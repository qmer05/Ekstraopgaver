package _3sammenlign_byer;

import java.util.ArrayList;

public class Cities {

    ArrayList<City> cities;

    public Cities() {
        cities = new ArrayList<>();
    }

    public void adCity(City city) {
        cities.add(city);
    }

    public City getBiggestCity() {
        City biggestCity = cities.get(0);
        for (City city : cities) {
            if (city.getPopulation() > biggestCity.getPopulation()) {
                biggestCity = city;
            }
        }
        return biggestCity;
    }

    public int getTotalPopulation() {
        int totalPopulation = 0;
        for (City c : cities) {
            totalPopulation += c.getPopulation();
        }
        return totalPopulation;
    }

    public int getAveragePopulation() {
        int totalPopulation = 0;
        for (City c : cities) {
            totalPopulation += c.getPopulation();
        }
        return totalPopulation / cities.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (City c : cities) {
            sb.append(c + "\n");
        }
        return sb.toString();
    }
}
