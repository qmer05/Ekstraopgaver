package _1beregning_af_areal;

public class Main {
    public static void main (String [] args){

        Square square = new Square(2.5,3.5);

        Circle circle = new Circle(6.5);

        Shapes shapes = new Shapes();
        shapes.addShape(square);
        shapes.addShape(circle);

        System.out.println("Square area: " + square.calculateArea());
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Total shapes area: " + shapes.totalArea());

    }
}
