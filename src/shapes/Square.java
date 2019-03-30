package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }


    public double getPerimeter() {
        return width * 4;
    }

    public double getArea() {
        return width * width;
    }

    void setLength(int length) {
        this.length = length;
    }

    void setWidth(int width) {
        this.width = width;
    }
}