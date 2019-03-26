package oop;

public class PostTest {

    public static void main(String[] args) {
        Post p = new Post(
                "Post 1",
                "01/01/1999",
                45,
                "THIS IS MY POST");


        System.out.println(p.getThatTitle());
        p.changeThatTitle("New Title");
        System.out.println(p.getThatTitle());

//        p.title = "My Cool Post";
        System.out.println(p);


    }
}
