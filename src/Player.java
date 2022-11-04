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
        System.out.println("\t\t" + name);
        System.out.print("\t\thealth : ");
        //create do while to pringt hp []
        int i = 0;
        do {
            System.out.print("[]");
            i++;
        } while (i < health / 10);

        System.out.println();
        System.out.println("\t\tyour attack is " + attack);
    }
}
