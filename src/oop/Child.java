package oop;

//Mage,Warrior,Rogue,Priest Class
public class Child extends Parent {
    public String name = "Child";


    void run(){
        super.run();//see the parent run
                    // allows the ability to get private properties
        System.out.println("run, " + this.name + ", run");
    }

    public static void main(String[] args) {
        Child baby = new Child();

        //uses inheritedMethod from Parent
//        baby.inheritedMethod();
        baby.run();
    }




}
