abstract class Arena {
    protected String name, weapon;
    protected int health;
    
    public Arena(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        this.health = health;
    }

    
    public abstract void info();

    public int attack() {
        return 0;
    }
}
