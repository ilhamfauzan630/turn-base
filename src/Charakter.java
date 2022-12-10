public class Charakter extends Arena {
    protected String name, weapon;
    protected int health;

    //constructor
    public Charakter(String name, String weapon, int health) {
        super(name, weapon, health);
        this.name = name;
        this.weapon = weapon;
        this.health = health;
    }

    //info player/enemy
    public void info() {
        System.out.println("your name is " + name);
        System.out.println("your weapon is " + weapon);
        System.out.println("your health is " + health);
    }
}
