package oop;

public class BurgerTester {
    public static void main(String[] args) {

        BurgerTools Burger1 = new BurgerTools("Mushrooms, Swiss, Onions", 3, 165);
//        MushroomSwiss.mostPopularToppings = "Mushrooms, Swiss, Onions";
//        MushroomSwiss.averageDaysBeforeExpiration = 3;
//        MushroomSwiss.temperatureWhenCooked = 165;
        Burger1.grill();

        System.out.println(Burger1.mostPopularToppings);
        System.out.println(Burger1.averageDaysBeforeExpiration);
        System.out.println(Burger1.temperatureWhenCooked);



    }



}
