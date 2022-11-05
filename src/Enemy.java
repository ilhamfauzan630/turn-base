public class Enemy extends Charakter{
    private String name, weapon;
    private int health, attack;
    private Boolean isEnemy, isAlive;

    //constructor child class
    public Enemy(String name, String weapon, int health) {
        super(name, weapon, health);
        this.name = name;
        this.weapon = weapon;
        this.health = health;
    }

    public Enemy(String name, String weapon, int health, Boolean isAlive) {
        super(name, weapon, health);
        this.name = name;
        this.weapon = weapon;
        this.health = health;
        this.isAlive = isAlive;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getAttack() {
        return attack;
    }
    
    public Boolean setEnemy(Boolean isEnemy) {
        return this.isEnemy = isEnemy;
    }
    
    public int attack() {
        if (this.isEnemy == true) {
            this.attack = this.attack / 2;
        }
        return this.attack;
    }

    

    public void info() {
        //octo
        System.out.println("     Enemy");
        System.out.println("       V");
        System.out.println("      ___");
        System.out.println("     /   \\");
        System.out.println("     \\   /");
        System.out.println(" /+/\\ ___  /+/\\");
        System.out.println("// \\+ === //  \\+");
        System.out.println(this.name);
        System.out.print("health : ");
        
        int i = 0;
        do {
            System.out.print("[]");
            i++;
        } while (i < this.health / 10);

        System.out.println();
        System.out.println("enemy weapon : " + this.weapon);
        System.out.println("enemi power : " + attack());
    }
}
