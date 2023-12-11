package _3sammenlign_byer;

public class Main {

    public static void main(String[] args) {

        City kongensLyngby = new City("Kongens Lyngby", 57500);
        City ribe = new City("Ribe", 8257);
        City storvorde = new City("Storvorde", 3425);
        City tarm = new City("Tarm", 4010);
        City horreby = new City("Horreby", 305);

        Cities cities = new Cities();
        cities.adCity(kongensLyngby);
        cities.adCity(ribe);
        cities.adCity(storvorde);
        cities.adCity(tarm);
        cities.adCity(horreby);

        System.out.println(cities);
        System.out.println("The biggest city: " + cities.getBiggestCity().getName());
        System.out.println("The total population of the cities: " + cities.getTotalPopulation());
        System.out.println("The average population of the cities: " + cities.getAveragePopulation());

    }
}
