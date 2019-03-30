package RPG;

public class Mage extends Character{
    public int magicPower;
    public int fireDamage;
    public int iceDamage;
    public int fireCost;
    public int iceCost;
    public boolean mage;


    public Mage(){
//        super(); --pulls from the previous class
        this.attack = 3;
        this.magicPower = 20;
        this.fireDamage = 6;
        this.fireCost = 5;
        this.iceDamage = 8;
        this.iceCost = 7;
        this.mage = true;
        this.health = 22;
    }


    public void castFire(){
        System.out.println(this.name + " cast FIRE for a total of " + this.fireDamage + " damage");
        //enemy health = enemy health - fire damage
        Character.health = Character.health - fireDamage;
    }

    public void castIce(){
        System.out.println(this.name + " cast ICE for a total of " + this.iceDamage + " damage");
        //enemy health = enemy health - ice damage
        Character.health = Character.health - iceDamage;
    }





    public static void main(String[] args) {
        Mage hero = new Mage();
        hero.castFire();

    }
}
