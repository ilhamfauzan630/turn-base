public class Player extends Charakter{
    private String name, weapon;
    public int health;
    private int attack;
    private Boolean isEnemy;
    public Boolean isAlive;

    //constructor
    public Player(String name, String weapon, int health) {
        super(name, weapon, health);
        this.name = name;
        this.weapon = weapon;
        this.health = health;
    }

    //overloading constructor
    public Player(String name, String weapon, int health, Boolean isAlive) {
        super(name, weapon, health);
        this.name = name;
        this.weapon = weapon;
        this.health = health;
        this.isAlive = isAlive;
    }

    //setter
    public void setAttack(int attack) {
        this.attack = attack;
    }

    //getter
    public int getAttack() {
        return attack;
    }

    //setter isEnemy
    public Boolean setEnemy(Boolean isEnemy) {
        return this.isEnemy = isEnemy;
    }

    //attack
    public int attack() {
        if (this.isEnemy != true) {
            return this.attack;
        }
        return this.attack = this.attack + 10;
    }

    //skill
    public int useSkill() {
        if (this.isEnemy != true) {
            return this.attack = this.attack + 10;
        }
        return this.attack = this.attack + 20;
    }

    //print info charakter
    public final void info() {
        System.out.println("\t\tPlayer");
        System.out.println("\t\t  V");
        System.out.println("\t\t _");
        System.out.println("\t\t -");
        System.out.println("\t\t/|| \\");
        System.out.println("\t\t _");

        System.out.println("\t\t/  \\");
        System.out.println("\t\t|  |");

        System.out.println("\t\t" + this.name);
        System.out.print("\t\thealth : ");
        //create do while to pringt hp []
        int i = 0;
        do {
            if(this.health < 10) {
                break;
            }
            System.out.print("[]");
            i++;
        } while (i < this.health / 10);

        System.out.println();
        System.out.println("\t\tplayer role : " + this.weapon + "man");
        System.out.println("\t\tyour power : " + attack());
    }
}
