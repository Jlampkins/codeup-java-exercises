package oop;
//a class is a description of what things of that type have in common
public class Parent {
    public String inheritedString;

//    public Parent(String str){
//        this.inheritedString = str;
//    }

    public Parent(){
        this.inheritedString = "Father";
    }


    //firespell
    public void inheritedMethod(){
        System.out.printf("Hello from %s ", this.inheritedString);
    }

    void run (){
        System.out.println("See the parent run");
    }

//public // protected // package // private -- accessibility
    //public is available to any other class -- The World
    //package available in the class and those that share the package not subclass
    //protected available to package/class or sub class
    //private only available within that class


    //super over rides the initial method calls most of it and then gives something new
//polymo
    public static void main(String[] args) {
        Parent father = new Parent();
        father.inheritedMethod();
    }









}
