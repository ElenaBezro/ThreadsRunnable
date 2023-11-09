package day4_SOLID_principles.shape;

public class Shape {
    private double perimeter;
    private PerimeterCalculator perimeterCalculator;

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void calculatePerimeter() {
        perimeterCalculator.calculatePerimeter(this);
    }
}
