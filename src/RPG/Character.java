package RPG;

public class Character {
    public String name;
    static int health;
    public int attack;
    public int potionNum;
    public int potionStrength;
    public int goldPoint;



    public Character(){
        this.name = "Bowie";
        this.health = 25;
        this.attack = 5;
        this.potionNum = 3;
        this.potionStrength = 5;
        this.goldPoint = 100;
    }

    public static int getHealth() {
        return health;
    }
}


