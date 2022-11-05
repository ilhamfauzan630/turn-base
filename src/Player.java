public class Player extends Charakter{
    private String name, weapon;
    private int health, attack;
    private Boolean isEnemy, isAlive;

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

    public int attack() {
        if(isEnemy != true){
            this.attack = this.attack + 15;
        }
        return this.attack;
    }

    //print info charakter
    public void info() {
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
            System.out.print("[]");
            i++;
        } while (i < this.health / 10);

        System.out.println();
        System.out.println("\t\tplayer role : " + this.weapon + "man");
        System.out.println("\t\tyour power : " + attack());
    }
}
