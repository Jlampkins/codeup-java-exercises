package shapes;
import util.Input;
public class CircleApp {


    public static void main(String[] args) {
        System.out.println("Enter a radius");
        Input scanner = new Input();
        double radius = scanner.getDouble();
        Circle myCircle = new Circle(radius);


        System.out.println(myCircle.getArea());

        System.out.println(scanner.yesNo());

        scanner.getInt(1,10);
    }




}
