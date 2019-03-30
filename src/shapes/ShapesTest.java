package shapes;

public class ShapesTest {


    public static void main(String[] args) {
//        Measurable myShape = new Square(4);
//        Measurable myShape1 = new Rectangle(4, 5);
//        Quadrilateral myShape2 = new Square(5);



        Measurable myShape;
        myShape = new Square(7);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        myShape = new Rectangle(5, 10);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

//        System.out.println(myShape.getArea());
//        System.out.println(myShape.getPerimeter());
//        System.out.println(myShape1.getArea());
//        System.out.println(myShape1.getPerimeter());
//
//        System.out.println(myShape2.getLength());



        //myShape variable with the getWidth and getLength methods requires a cast

    }
}
