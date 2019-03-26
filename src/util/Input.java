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
        return(result.startsWith("y") || result.equalsIgnoreCase("yes"));
    }

    public int getInt(){
        if(scanner.hasNextInt()){
            return scanner.nextInt();
        }
        scanner.next();
        return getInt();
    }


    public int getInt(int min, int max){
        int userInt = getInt();
        if (userInt >= min && userInt <= max){
            return userInt;
        }
        scanner.next();
        return getInt(min,max);
    }

    public double getDouble(){
        if(scanner.hasNextDouble()){
            return scanner.nextDouble();
        }
        scanner.next();
        return getInt();
    }

    public double getDouble(double min, double max){
        double sillynum;
        do {
            System.out.println("Please enter a silly number");
            sillynum = scanner.nextInt();

        }while(sillynum < min || sillynum > max);
        return sillynum;
    }





    public static void main(String[] args) {
        Input scanner = new Input();

//        System.out.println(scanner.getDouble(1, 50));


    }
}
