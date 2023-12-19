package _10lommeregner;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double result = calculator.getResult();

        System.out.println(result);

        calculator.add(24.25);
        System.out.println(calculator.getResult());

        calculator.subtract(12.55);
        System.out.println(calculator.getResult());

        double[] numbers = {2, 4, 6, 8, 2.3, 4.6, 9.2};
        calculator.add(numbers);
        System.out.println(calculator.getResult());

        calculator.clear();
        System.out.println(calculator.getResult());
    }
}
