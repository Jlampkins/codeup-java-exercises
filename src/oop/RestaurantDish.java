package oop;

public class RestaurantDish {
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    private void eat(){
        System.out.println("Nom nom nom!");
    }

    public RestaurantDish(String nameOfDish, int costInCents, boolean wouldRecommend){
        this.nameOfDish = nameOfDish;
        this.costInCents = costInCents;
        this.wouldRecommend = wouldRecommend;
    }

    public String getNameOfDish(){
        return this.nameOfDish;
    }
    public void setNameOfDish(String nameOfDish){
        this.nameOfDish = nameOfDish;
    }

    public int getCostInCents(){
        return this.costInCents;
    }
    public void setCostInCents(int costInCents){
        this.costInCents = costInCents;
    }

    public boolean getWouldRecommend(){
        return this.wouldRecommend;
    }
    public void setWouldRecommend(boolean wouldRecommend){
        this.wouldRecommend = wouldRecommend;
    }



}
