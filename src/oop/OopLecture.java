package oop;

public class OopLecture {
    public static void main(String[] args){
        //==========slide 3 classes and objects  How to create specific heros?
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = p1; //creating a different name for the same Object
        System.out.println(p3 == p1); //this is true because the address is the same

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        //public can be used anywhere else in the code

        //each Person has a different address/ID

//        System.out.println(p1.firstName);
//        System.out.println(p1.lastName);
//        System.out.println(p1.age);
//
//        p1.firstName = "James";
//        p1.lastName = "Lampkins";
//        p1.study = "warrior";
//        System.out.printf("%s %s %s\n", p1.firstName, p1.lastName, p1.study); //this is still p1 when loggin because p3 has not been created yet.
//
//
//        p2.firstName = "Bethany";
//        p2.lastName = "Brody";
//        p2.study = "mage";
//        System.out.printf("%s %s %s\n", p2.firstName, p2.lastName, p2.study);
//
//        p3.firstName = "Jeremy";
//        p3.lastName = "Logan";
//        p3.study = "warrior";
//        System.out.printf("%s %s %s\n", p3.firstName, p3.lastName, p3.study);
//        System.out.printf("%s %s %s\n", p1.firstName, p1.lastName, p1.study); //changes p1 to p3 since you are logging AFTER creating p3.
//
//        System.out.println(p1 == p2); //this is false.  They have a different address
//
//        System.out.println(p1.sayHello());
    }
}
