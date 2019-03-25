import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        for( int i = 5; i <= 15; i++){
//            System.out.println(" " + i);
//        }
//        int i = 5;
//        while(i <= 15){
//            System.out.print(" " + i);
//            i++;
//        }


//        for(int x = 0; x <= 100; x+=2){
//            System.out.println(x);
//        }
//        int x = 0;
//        do{
//            System.out.println(x);
//            x += 2;
//        }while (x <=100);


//        for(int y = 100; y >= -10; y-=5){
//            System.out.println(y);
//        }
//        int y = 100;
//        do{
//            System.out.println(y);
//            y -= 5;
//        }while (y >= -10);

//        for(double z = 2; z < 1000000; z*=z){
//            System.out.println((int)z);
//        }
//        long z = 2;
//        do{
//           z *= z;
//            System.out.println(z);
//        }while(z < 1000000);
//        /** why do I get zero when using int? **/


//        for(int v = 1; v < 101; v++){
//            if(v % 15 == 0){
//                System.out.print(v);
//                System.out.println(" FizzBuzz");
//            }else if(v % 3 == 0){
//                System.out.print(v);
//                System.out.println(" Fizz");
//            }else if(v % 5 == 0){
//                System.out.print(v);
//                System.out.println(" Buzz");
//            }else {
//                System.out.println(v);
//            }
//        }

        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.print("Please provide me an integer, human");
            int num = scanner.nextInt();
            System.out.println();
            System.out.println("Here is your table:");
            System.out.println();
            System.out.println("number | squared  | cubed");
            System.out.println("------ | -------- | -----");

            for (int j = 1; j <= num; j++) {
                int pow = j * j;
                int cube = j * j * j;
                System.out.printf("%-6d | %-8d | %-7d\n", j, pow, cube);
            }
            System.out.println("Continue? [y/n]");
            answer = scanner.next();
        }while (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes"));


        String agree;
        do {

            System.out.println("Please enter your grade, dumb ass");
            int grade = scanner.nextInt();
            if (grade <= 100 && grade >= 96) {
                System.out.println("Your grade is A+");
            } else if (grade <= 95 && grade >= 93) {
                System.out.println("Your grade is A");
            } else if (grade <= 92 && grade >= 88) {
                System.out.println("Your grade is A-");
            } else if (grade <= 87 && grade >= 84) {
                System.out.println("Your grade is B+");
            } else if (grade <= 85 && grade >= 83) {
                System.out.println("Your grade is B");
            } else if (grade <= 82 && grade >= 80) {
                System.out.println("Your grade is B-");
            } else if (grade <= 79 && grade >= 76) {
                System.out.println("Your grade is C+");
            } else if (grade <= 75 && grade >= 72) {
                System.out.println("Your grade is C");
            } else if (grade <= 71 && grade >= 67) {
                System.out.println("Your grade is C-");
            } else if (grade <= 66 && grade >= 64) {
                System.out.println("Your grade is D+");
            } else if (grade <= 65 && grade >= 63) {
                System.out.println("Your grade is D");
            } else if (grade <= 63 && grade >= 60) {
                System.out.println("Your grade is D-");
            } else if (grade <= 59 && grade >= 56) {
                System.out.println("Your grade is F+");
            } else if (grade <= 55 && grade >= 53) {
                System.out.println("Your grade is F");
            } else if (grade <= 52 && grade >= 0) {
                System.out.println("Your grade is F-");
            }else {
                System.out.println("An incorrect grade was entered.");
            }


        System.out.println("Continue? [y/n]");
            agree = scanner.next();
    }while (agree.equalsIgnoreCase("y") || agree.equalsIgnoreCase("yes"));





    }
}
