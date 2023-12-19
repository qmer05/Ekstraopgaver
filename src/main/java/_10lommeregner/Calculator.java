package _10lommeregner;

import java.util.ArrayList;

public class Calculator {
    double result = 0.0;


    public double getResult() {
        return result;
    }

    public void add(double x) {
        result += x;
    }

    public void subtract(double x) {
        result -= x;
    }

    public void clear() {
        result = 0.0;
    }

    public void add(double[] numbers) {
        for (double d : numbers) {
            result += d;
        }
    }
}
