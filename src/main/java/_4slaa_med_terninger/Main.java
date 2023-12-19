package _4slaa_med_terninger;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int totalThrows = 100;

        Cup cup = new Cup();

        int identicalThrows = cup.howManyIdenticalThrows(totalThrows);

        System.out.println("Two dice rolled " + totalThrows + " times with identical throws: " + identicalThrows);

        System.out.println("Succes rate of identical throws: " + (float) identicalThrows / (float) totalThrows * 100 + "%");

        System.out.println("Total of each throw with two dices each time: " + Arrays.toString(cup.results(5)));

    }
}
