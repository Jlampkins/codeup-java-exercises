package shapes;

public class Circle {
    private double radius;

    public Circle(double radius){
    this.radius = radius;
    }

    public double getArea(){
        return Math.pow(radius, 2) * Math.PI;
    }

    public double getCircumference(){
        return Math.PI * (radius * 2);
    }


    public static void main(String[] args) {

    }

}
