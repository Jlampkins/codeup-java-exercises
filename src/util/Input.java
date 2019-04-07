package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

//constructor
    public Input(){
        this.scanner = new Scanner(System.in);
//        scanner = new Scanner(System.in);
    }

    public String getString(){
        return scanner.nextLine();
    }

    public boolean yesNo(){
        String result = scanner.nextLine();
        while(result.equals("")) result = scanner.nextLine(); //used to ensure input is entered before continuing.
        return(result.startsWith("y") || result.startsWith("Y"));
    }

    public int getInt(){
        Integer num;
        String input = scanner.nextLine();
        try {
            num = Integer.valueOf(input);
        } catch (NumberFormatException nfe) {
            System.out.println("You must enter a number");
            num = getInt(); //calls itself to loop
        }
        return num;
    }


    public int getInt(int min, int max){
        Integer userInt;
        String input = scanner.nextLine();
        try {
            userInt = Integer.valueOf(input);
        }catch(NumberFormatException nfe){
            System.out.println("You need a number, stupid");
            return getInt(min, max);
        }
        if (userInt >= min && userInt <= max){
            return userInt;
        }
        System.out.println("That number is not in range");
        return getInt(min,max);
    }

    public double getDouble(){
        Double num;
        String input = scanner.nextLine();
        try {
            num = Double.valueOf(input);
        } catch (NumberFormatException nfe) {
            System.out.println("You must enter a number");
            num = getDouble(); //calls itself to loop
        }
        return num;
    }

    public double getDouble(double min, double max){
        Double userDouble;
        String input = scanner.nextLine();
        try {
            userDouble = Double.valueOf(input);
        }catch(NumberFormatException nfe){
            System.out.println("You need a number, stupid");
            return getDouble(min, max);
        }
        if (userDouble >= min && userDouble <= max){
            return userDouble;
        }
        System.out.println("That number is not in range");
        return getDouble(min,max);
    }





    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("What is the number?");
        input.getInt();
//        System.out.println(scanner.getDouble(1, 50));
        System.out.println("enter a number");
        input.getInt(1,6);


    }
}
