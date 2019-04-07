package oop;

import oop.Student;

import java.lang.reflect.Array;
import java.util.*;

public class CollectionsPractice {

    public static void main(String[] args) {

//cannot use int.  Integer is a wrapper class for int.
        Map<Integer, String> friends = new HashMap<>();

        friends.put(1, "Jerome");
        friends.put(78, "Bethany");
        friends.put(75, "James");
        friends.put(55, "dumb ass");
        System.out.println(friends);
        friends.putIfAbsent(55, "Jumbo");
        System.out.println(friends.get(75));
        friends.replace(1, "Jimmy");
        friends.remove(78);
//        friends.remove(88);
        System.out.println(friends);

        if(friends.containsKey(55)){
            System.out.println("friend 55 is " + friends.get(55));
            friends.remove(88);
            System.out.println(friends);
            friends.clear();
            System.out.println(friends);
        }




        ArrayList<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Monday"); //adds Monday to the array
        daysOfWeek.add("Tuesday"); //adds Tuesday to the array
        daysOfWeek.add(0, "Sunday"); //adds Sunday to index 0
        System.out.println(daysOfWeek.size()); //shows the size of the array
        System.out.println(daysOfWeek.get(2)); //2 doesnt exist so you get -1
        daysOfWeek.indexOf("Tuesday"); //gets the index of the specified item.  Will give the first index of the item if there are multiples
        System.out.println(daysOfWeek.indexOf(2));

        System.out.println(daysOfWeek); //prints the entire array of daysOfWeek


        ArrayList<String> roasts = new ArrayList<>();
        roasts.add("light");
        roasts.add("dark");
        roasts.add("medium");
        roasts.add("medium");

        roasts.contains("dark"); //returns true since roasts contain dark.
        roasts.contains("dumb ass"); //returns false since there is no dumb ass roast.

        roasts.lastIndexOf("medium"); //provides the last index that medium is located.
        roasts.isEmpty(); //provides false as the roasts array is not empty.

        roasts.remove("medium"); //removes the specific roast provided
        roasts.remove(2); //removes the roast at index 2 (medium

        System.out.println(roasts);

        for(String roast : roasts){
            System.out.println(roast);
        }
//have to build individual
        List<Student> zion = new ArrayList<>();



        List<String> inv = new ArrayList<>();
        //whats the difference between these two?
//        ArrayList<String> inv = new ArrayList<>();
//        String[] playerInventory = {"axe", "pepsi", "sword", "flashlight"};

        System.out.println("You see a rusty axe on the floor next to a can of pepsi.");
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        if(choice.equalsIgnoreCase("take axe")){
            System.out.println("You picked up the axe");
            inv.add("axe");
        }
        System.out.println(inv);

        System.out.println("Troll has dropped a health potion");
        inv.add("health potion");
        inv.add("health potion");
        inv.add("health potion");
        System.out.println(inv); //will show 3 health potions
        inv.remove("health potion");
        inv.remove("health potion");

        System.out.println(inv);//will have 2 health potions removed and show just 1

        for(int i = 0; i<inv.size(); i++){
            System.out.println(inv.get(i));
        }


    }//end of Main
}//end of class
