package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width);
    }


    public double getPerimeter() {
        return 2 + (length + width);
    }

    public double getArea() {
        return width * length;
    }

    void setLength(int length) {
    this.length = length;
    }

    void setWidth(int width) {
        this.width = width;
    }


}
