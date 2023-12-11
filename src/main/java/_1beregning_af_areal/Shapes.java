package _1beregning_af_areal;

import java.util.ArrayList;

public class Shapes {
    ArrayList<Shape> shapes;

    public Shapes (){
        shapes = new ArrayList<>();
    }

    public void addShape(Shape s) {
        shapes.add(s);
    }

    public double totalArea() {
        double total = 0;
        for (Shape s : shapes) {
            total += s.calculateArea();
        }
        return total;
    }

}
