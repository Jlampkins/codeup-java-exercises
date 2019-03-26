package oop;

public class Pug {

    //static because it's a general numer
    public static int numOfpugs = 1000;
    public String name = "Pug Doe";
    public int age;
    //booleans start with is
    public boolean isCute;

    public String grunt(){
        return "Hello, human.  I am " + name + ".";
    }



    //static method -- helpful tool
    //compare two pugs and gives the youngest
    //returns an object.  Put in the object.
    //type needs to go in the parameters (object)
    public static Pug returnYoungestPug(Pug p1, Pug p2){
        return(p1.age < p2.age) ? p1 : p2;
    }


//outside the main.  Helps show the properties of an object.
    //control + enter will give the toString override
    @Override
    public String toString() {
        return "Pug{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isCute=" + isCute +
                '}';
    }

    public static void main(String[] args) {
        Pug pug1 = new Pug();
        pug1.name = "Fred";
        pug1.age = 3;
        pug1.isCute = false;

        //only gives the address
        System.out.println(pug1.toString());

        Pug pug2 = new Pug();
        pug2.name = "Bowser";
        pug2.age = 5;
        pug2.isCute = true;

//we can view the object property or chain specifics to the method for more idea.
        System.out.println(Pug.returnYoungestPug(pug1, pug2).name);

        System.out.println(pug1.grunt());
        System.out.println(Pug.numOfpugs);
    }
}


