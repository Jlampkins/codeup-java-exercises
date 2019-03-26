import java.util.Scanner;
public class MethodExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(add(1, 2));
        System.out.println(subtract(5, 4));
        System.out.println(multiply(5, 6));
        System.out.println(divide(4, 2));
        System.out.println(modular(12, 4));


//        System.out.println(dice());

/** 4 **/
//boolean diceRoll = true;
//        System.out.println("Enter the number of sides for the dice");
//        int sides = scanner.nextInt();
//do {
//    System.out.println("Roll the dice!");
//    String roll = scanner.next();
//    if (roll.startsWith("R") || roll.startsWith("roll")) {
//        int dice1 = (dice(sides));
//        int dice2 = (dice(sides));
//        System.out.println(dice1);
//        System.out.println(dice2);
//    }
//    System.out.println("Would you like to roll again?");
//    String diceContinue = scanner.next();
//    if(diceContinue.startsWith("N")){
//        diceRoll = false;
//    }
//}while(diceRoll);

/** 3 **/
//boolean toContinue = true;
//do {
//    System.out.println("Enter a number from 1 through 10");
//    int factor = scanner.nextInt();
//    System.out.println(factorial(factor));
//    System.out.println("Would you like to continue?");
//    String cont = scanner.next();
//    if (cont.startsWith("n") || cont.startsWith("N")) {
//        toContinue = false;
//    }
//}while(toContinue);

/** 2 **/
//boolean rangeTime = true;
//        do {
//            System.out.println("Enter two numbers between 1 and 10: ");
//            int min = scanner.nextInt();
//            int max = scanner.nextInt();
//            System.out.println(getInteger(min, max));
//            System.out.println("Continue? Y/N");
//            String rangeCont = scanner.next();
//            if (rangeCont.startsWith("n") || rangeCont.startsWith("N")) {
//                rangeTime = false;
//
//            }
//            }
//            while (rangeTime) ;

    }


    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int modular(int num1, int num2) {
        return num1 % num2;
    }


/** 2 **/
//    public static String getInteger(int min, int max){
//        if(min >= 1 && max <= 10){
//            return "That's in the range, buddy!";
//        }else{
//            return "Nah, try again";
//        }
//
//    }

/** 3 **/
//    public static int factorial(int factor) {
//        int total = 1;
//        for (int i = 1; i <= factor; i++) {
//            total *= i;
//        }
//        return total;
//    }

    /**
     * 4
     **/
//    public static String dice() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number of sides for the dice");
//        int sides = scanner.nextInt();
//
//        System.out.println("Roll the dice!");
//        String roll = scanner.next();
//        if (roll.startsWith("R") || roll.startsWith("roll")) {
//            int dice1 = (int) (Math.random() * sides + 1);
//            int dice2 = (int) (Math.random() * sides + 1);
//            return String.format("%d, %d", dice1, dice2);
//        } else {
//            return "This is stupid";
//
//        }
//
//
//    }

}

