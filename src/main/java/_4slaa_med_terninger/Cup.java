package _4slaa_med_terninger;

public class Cup {
    Die die1;
    Die die2;

    public Cup() {
        die1 = new Die(6);
        die2 = new Die(6);
    }

    public int howManyIdenticalThrows(int times) {
        int i = 0;
        int totalIdenticalThrows = 0;
        while (i <= times) {
            int firstDieRoll = die1.roll();
            int secondDieRoll = die2.roll();
            if (firstDieRoll == secondDieRoll) {
                totalIdenticalThrows += 1;
            }
            i++;
        }
        return totalIdenticalThrows;
    }

    public int[] results(int times) {
        int[] totalResults = new int[times];
        for (int i = 0; i < times; i++) {
            int firstDieRoll = die1.roll();
            int secondDieRoll = die2.roll();
            totalResults[i] = firstDieRoll + secondDieRoll;
        }
        return totalResults;
    }
}
