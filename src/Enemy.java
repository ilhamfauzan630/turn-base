public class Enemy extends Charakter{
    String name, weapon;
    int health, attack;
    
    public Enemy(String name, String weapon, int health) {
        super(name, weapon, health);
        this.name = name;
        this.weapon = weapon;
        this.health = health;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getAttack() {
        return attack;
    }

    public void info() {
        System.out.println(name);
        System.out.print("health : ");
        
        int i = 0;
        do {
            System.out.print("[]");
            i++;
        } while (i < health / 10);

        System.out.println();
        System.out.println("your attack is " + attack);
    }
}
