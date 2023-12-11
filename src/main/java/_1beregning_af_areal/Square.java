package _1beregning_af_areal;

public class Square implements Shape {

    private double height;
    private double length;

    public Square(double height, double length){
        this.height = height;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return height * length;
    }
}
