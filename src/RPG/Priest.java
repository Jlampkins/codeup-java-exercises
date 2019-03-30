package RPG;

public class Priest extends Character {
    public int magicPower;
    public int shieldAmount;
    public int boostAmount;
    public int shieldCost;
    public int boostCost;
    public boolean priest;


    public Priest() {
        this.magicPower = 20;
        this.shieldAmount = 10;
        this.boostAmount = 8;
        this.shieldCost = 5;
        this.boostCost = 5;
        this.priest = true;
    }


    public void castSheild(){
        System.out.println(this.name + " cast SHIELD and gained a shield of " + this.shieldAmount + "points");
        //priest health = priest health + shieldAmount (only for a certain duration)
        Character.health +=  this.shieldAmount;
    }

    public void castBoost(){
        System.out.println(this.name + " cast BOOST.  Attack has increased by " + this.boostAmount + " points");
        //priest attack = priest attack + boostAmount (only for a certain duration)
        this.attack += this.boostAmount;
    }
}
