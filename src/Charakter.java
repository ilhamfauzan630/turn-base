public class Charakter {
    private String name, weapon;
    private int health;
    
    public Charakter(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        this.health = health;
    }

    public String getName() {
        return name;
    }
    public String getWeapon() {
        return weapon;
    }
    public int getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void info() {
        System.out.println("your name is " + name);
        System.out.println("your weapon is " + weapon);
        System.out.println("your health is " + health);
    }
}
