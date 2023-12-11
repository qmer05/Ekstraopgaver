package _3sammenlign_byer;

import java.util.ArrayList;

public class Cities {

    ArrayList<City> cities = new ArrayList<>();

    public void adCity(City city) {
        cities.add(city);
    }

    public City getBiggestCity() {
        City biggestCity = null;
        int biggestPopulation = 0;

        for (City c : cities) {
            biggestPopulation = c.getPopulation();
            if (biggestPopulation > c.getPopulation()){
                biggestPopulation = c.getPopulation();
            }
        }
        return biggestCity;
    }

}
