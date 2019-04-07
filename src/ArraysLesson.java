import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysLesson {

    //used for inventory?

    public static void main(String[] args) {

        String[] inventory = new String[8];


        //interdimensional array
        //game board with a character and enemy
        int[][][] java2DArray = new int [3][3][3];
        java2DArray[2][1][0] = 42;

        String[][] javaArray = new String [3][3];
        javaArray[2][1] = "String Value";

        char[][] chessBoard = {
                {'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R'},
                {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
                {'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'},
                {'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'},
                {'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'},
                {'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'},
                {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'},
                {'r', 'n', 'b', 'q', 'k', 'b', 'n', 'r'}

        };

        System.out.println(Arrays.toString(chessBoard));

        int[] phoneNumber = new int [7];
        int[] phoneNumber2 = new int [7];

        boolean[] decisions = new boolean [4];
        boolean[] altDecisions = {true, true, false, false};

        String[] answers = new String [4];

        answers[0] = "Yes";
        answers[1] = "True";
        answers[2] = "Seven";
//        answers[7] = "out of bounds for set Array";
        System.out.println(answers[answers.length - 1]);
        System.out.println(phoneNumber[4]);


        //how to loop through the array
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for(int i = 0; i<daysOfWeek.length; i++)
        System.out.println(daysOfWeek[i]);

        for(String day : daysOfWeek){
            System.out.println(day);
        }
        String[] nameOfFriends = new String[4];

        nameOfFriends[0] = "Adrien";
        nameOfFriends[1] = "Jeremy";
        nameOfFriends[2] = "Travis";
        nameOfFriends[3] = "Bethany";
        //how to print out the entire array
        System.out.println(Arrays.toString(nameOfFriends));


        //using classes with Array
        Person thisGuy = new Person("Jack Johnson");
        Person thatGuy = new Person("John Jackson");


        //fills the array with 4s
        Arrays.fill(phoneNumber, 4);
        for(int digit : phoneNumber){
            System.out.print(digit);
        }
//fill
        Arrays.fill(phoneNumber2, 4);
        if(Arrays.equals(phoneNumber, phoneNumber2)){
            System.out.println();
            System.out.println("These are the same");
        }else {
            System.out.println();
            System.out.println("they different");
        }
//equals without Array
        if(phoneNumber.equals(phoneNumber2)){
            System.out.println();
            System.out.println("These are the same");
        }else {
            System.out.println();
            System.out.println("they different");
        }
//copyOf
        int[] phoneNumber3 = Arrays.copyOf(phoneNumber, 8);
        System.out.println(Arrays.toString(phoneNumber3));

        System.out.println(Arrays.toString(daysOfWeek));
        Arrays.sort(daysOfWeek);
        System.out.println(Arrays.toString(daysOfWeek));


        String[] friends = new String[5];
        Arrays.fill(friends, "James");
        for(String friend : friends){
            System.out.println(friend);
        }

        Arrays.sort(friends);
        String[] realFriends = Arrays.copyOf(friends, 8);
        String listOfFriends = Arrays.toString(friends);
        friends.equals(realFriends);


//        System.out.println();
//        Arrays.sort(friends);
//        String[] realFriends = Arrays.copyOf(friends, 8);
//        String listOfFriends = Arrays.toString(friends);
//        friends.equals(realFriends);


            int[][] primes = new int[3][3];
            primes[2][2] = 1;

            System.out.println(primes[1][2]);


    }
}
