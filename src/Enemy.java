public class Enemy extends Charakter{
    String name, weapon;
    int health;
    //create constructor
    public Enemy(String name, String weapon, int health) {
        super(name, weapon, health);
    }

    public void attack() {
        System.out.println("your attack is " + weapon);
    }

}
