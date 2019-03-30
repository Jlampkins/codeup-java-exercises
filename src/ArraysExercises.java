import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {






//        gives the address of the array.  ToString will show the actual array
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//        System.out.println(Arrays.toString(numbers));

        Person[] thesePeople = new Person[3];
        thesePeople[0] = new Person("Tom");
//        System.out.println(thesePeople[0].getName());
        thesePeople[1] = new Person("Dick");
        thesePeople[2] = new Person("Harry");

        Person testPerson = new Person("James");

//        for (Person individual : thesePeople) {
//            System.out.println(individual.getName());
//        }

//        System.out.println(addPerson(thesePeople, testPerson));

        for(Person allThesePeople : addPerson(thesePeople, testPerson)) {
            System.out.println(allThesePeople.getName());

        }
//ServerNameGenerator nameGenerator = new ServerNameGenerator();
        System.out.println(ServerNameGenerator.randomWord());

    } //THIS IS END OF MAIN



    static Person[] addPerson(Person[] thesePeople, Person singlePerson) {
        Person [] newPeople;
        newPeople = Arrays.copyOf(thesePeople, thesePeople.length + 1);
        newPeople[newPeople.length - 1] = singlePerson;
        return newPeople;


    }

}
