package oop;

public class BurgerTools {
    public static String mostPopularToppings;
    public static int averageDaysBeforeExpiration;
    public static int temperatureWhenCooked;

    public BurgerTools(String toppings, int expiration, int temp){
        this.mostPopularToppings = toppings;
        this.averageDaysBeforeExpiration = expiration;
        this.temperatureWhenCooked = temp;
    }


    public void grill(){
        System.out.println("**Grilling Burger**");
    }


    public String getMostPopularToppings(){
        return this.mostPopularToppings;
    }
    public void changeThatTopping(String mostPopularToppings){
        this.mostPopularToppings = mostPopularToppings;
    }

    public int getAverageDaysBeforeExpiration(){
        return this.averageDaysBeforeExpiration;
    }
    public void setAverageDaysBeforeExpiration(int averageDaysBeforeExpiration){
        this.averageDaysBeforeExpiration = averageDaysBeforeExpiration;
    }

    public int getTemperatureWhenCooked(){
        return this.temperatureWhenCooked;
    }
    public void setTemperatureWhenCooked(int temperatureWhenCooked){
        this.temperatureWhenCooked = temperatureWhenCooked;
    }
}
