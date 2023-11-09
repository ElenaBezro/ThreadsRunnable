package day4_SOLID_principles.shape;

public class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }
}
