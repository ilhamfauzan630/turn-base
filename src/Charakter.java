public class Charakter {
    private String name, weapon;
    private int health;
    //create constructor
    public Charakter(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        this.health = health;
    }

    //create getters Charakter 
    public String getName() {
        return name;
    }
    public String getWeapon() {
        return weapon;
    }
    public int getHealth() {
        return health;
    }

    //create setters
    public void setName(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println("your attack is " + weapon);
    }
}
