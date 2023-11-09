package day4_SOLID_principles.shape;

public class PerimeterCalculator {
    public void calculatePerimeter(Shape shape) {
        if (shape instanceof Circle) {
            int radius = ((Circle) shape).getRadius();
            shape.setPerimeter(2 * Math.PI * radius);
        }

        if (shape instanceof Square) {
            int side = ((Square) shape).getSide();
            shape.setPerimeter(4 * side);
        }
    }
}
