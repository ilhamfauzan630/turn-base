public class Player extends Charakter{
    String name, weapon;
    int health;
    //create constructor
    public Player(String name, String weapon, int health) {
        super(name, weapon, health);
    }

    public void attack() {
        System.out.println("your attack is " + weapon);
    }

}
