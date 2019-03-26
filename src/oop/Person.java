package oop;
class Person {
    public static long worldPopulation = 7_500_000_000L; // class property
    public String name;                                  // instance property
    public static void main(String[] args) {
        Person theBestDrummerAlive = new Person();

        theBestDrummerAlive.name = "Neil Peart";
        Person.worldPopulation += 1; // accessing a static property

        // this also works, but is usually not a good idea
        // put the class name Person.worldPopulation when dealing with static property
        System.out.println(theBestDrummerAlive.worldPopulation); // 7500000001

        // DONT DO THIS, it will not compile.
//        System.out.println(Person.name);
        //use the object name when dealing with instance.
        System.out.println(theBestDrummerAlive.name);
    }
}




//public class Person {
//    //instance properties
//    public String firstName;
//    public String lastName;
//    public String study;
//    public int age;
//
//    // instance method
//    public String sayHello() {
//        return lastName + ", " + firstName + " says hi!";
//    }
//}


//static properties are normally used for tools (items that will not change)
//can have both static and instance in one class
// all are instance fields because they are not static.  Value or function on that object. That is unique to that object.
// (different first name, last name, different age, different study) instance fields do not have static field