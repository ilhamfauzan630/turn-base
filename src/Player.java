public class Player extends Charakter{
    String name, weapon;
    int health, attack;
    //create constructor
    public Player(String name, String weapon, int health) {
        super(name, weapon, health);
        this.name = name;
        this.weapon = weapon;
        this.health = health;
    }

    //create setter
    public void setAttack(int attack) {
        this.attack = attack;
    }

    //create getter
    public int getAttack() {
        return attack;
    }

    //print info charakter
    public void info() {
        System.out.println("your name is " + name);
        System.out.println("your weapon is " + weapon);
        System.out.println("your health is " + health);
        System.out.println("your attack is " + attack);
    }
}
