package _8zoologisk_have;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main (String [] args){

        Animal lion = new Lion(true);
        Animal parrot = new Parrot(false);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(lion);
        animals.add(parrot);

        for (Animal a : animals){
            a.makeSound();
        }

        Main main = new Main();

        ArrayList<Animal> mammals = main.filterMammals(animals);
        System.out.println("These are mammals: " + mammals);

        ArrayList<Animal> lions = main.filterLions(animals);
        System.out.println("These are lions: " + lions);

        // dyrene har ingen felter ud over isMammal, hvorfor jeg ikke kan få det til at print pænt


    }

    public ArrayList<Animal> filterMammals(ArrayList<Animal> animals){
        ArrayList<Animal> mammals = new ArrayList<>();
        for (Animal a : animals){
            if (a.getIsMammal()){
                mammals.add(a);
            }
        }
        return mammals;
    }

    public ArrayList<Animal> filterLions(ArrayList<Animal> animals){
        ArrayList<Animal> lions = new ArrayList<>();
        for (Animal a : animals){
            if (a instanceof Lion){
                lions.add(a);
            }
        }
        return lions;
    }

}
