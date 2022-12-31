public class Charakter extends Arena {
    protected String name, weapon;
    protected int health;
    String language;

    //constructor
    public Charakter(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        this.health = health;
    }

    //setter
    public void setLanguage(String language) {
        this.language = language;
    }

    //info player/enemy
    public void info() {
        if (this.language == "Indonesia") {
            System.out.println("nama anda adalah " + name);
            System.out.println("senjata anda adalah " + weapon);
            System.out.println("darah anda adalah " + health);
        } else{
            System.out.println("your name is " + name);
            System.out.println("your weapon is " + weapon);
            System.out.println("your health is " + health);
        }
    }
}
