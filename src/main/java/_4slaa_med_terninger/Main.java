package _4slaa_med_terninger;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cup cup = new Cup();
        System.out.println("Identical throws: " + cup.howManyIdenticalThrows(20));
        System.out.println("Sum of two dice rolls: " + Arrays.toString(cup.results(20)));
    }
}
