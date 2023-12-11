package _4slaa_med_terninger;

import java.util.Random;

public class Die {
    private int sides;

    public Die(int sides) {
        this.sides = sides;
    }

    public int roll() {
        Random rd = new Random();
        return rd.nextInt(1, sides + 1);
    }

}
