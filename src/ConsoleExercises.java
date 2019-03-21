import java.util.Scanner;

public class ConsoleExercises {
        public static void main(String[] args) {
//            double pi = 3.14159;
//            String theValue = "The value of pi is approximately:";
//            System.out.printf("%s %.2f \n", theValue, pi);

            Scanner scanner = new Scanner(System.in);
////            scanner.useDelimeter("\n");
//            System.out.println("Give me a number, simple human. ");
//            int num = scanner.nextInt();
//            System.out.printf("You entered: %d\n", num);
////
//            System.out.println("Provide me 3 words, meatbag.");
//            String word1 = scanner.next();
//            String word2 = scanner.next();
//            String word3 = scanner.next();
//            System.out.printf("You entered these words: %s, %s, %s \n", word1, word2, word3 );
//            scanner.nextLine();
//
//            System.out.println("I now require a full sentence.");
//            String sentence = scanner.nextLine();
//            System.out.printf("Here is your puny sentence: %s\n", sentence);

            System.out.println("what is the length of the classroom?");
//            double length = scanner.nextDouble();
//            double width = scanner.nextDouble();
            double length = new Double(scanner.nextLine());
            System.out.println("What is the width of the classroom");
            double width = scanner.nextDouble();
            System.out.println("What is the height of the room?");
            double height = scanner.nextDouble();
            System.out.printf("The area of the class room is %.2f.\n", length * width);
            System.out.printf("The perimeter of the classroom is %.2f.\n", (length * 2) + (width * 2));
            System.out.printf("The volume of the room is %.2f", length * width * height);




//            String length = scanner.next();
//            String width = scanner.next();
//            String height = scanner.next();
//            double lengthNum = Double.parseDouble(length);
//            double widthNum = Double.parseDouble(width);
//            double heightNum = Double.parseDouble(height);
//            double area = lengthNum * widthNum;
//            double perimeter = (lengthNum * 2) + (widthNum *2);
//            double volume = lengthNum * widthNum * heightNum;
//            System.out.printf("The area of the room is %.2f.\n" +
//                                "The perimeter of the room is %.2f.\n" +
//                                "The volume of the room is %.2f", area, perimeter, volume);



        }
    }
