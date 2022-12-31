import java.io.FileWriter;

public class FileInput {
    String player, enemy, weapon;
    int attack, health;

    public FileInput(String player, String enemy, String weapon, int attack, int health) {
        this.player = player;
        this.enemy = enemy;
        this.weapon = weapon;
        this.attack = attack;
        this.health = health;
    }

    public void logBattle() {
        try {
            FileWriter myWriter = new FileWriter("battleLog.txt");

            myWriter.write("\nBattle Log\n");
            myWriter.write(player + " vs " + enemy);
            myWriter.write("\nPlayer Info stat :\n");
            myWriter.write("\n weapon : " + weapon);
            myWriter.write("\n attack : " + attack);
            myWriter.write("\n health : " + health);
            myWriter.close();

        } catch (Exception e) {
            System.out.println("Error to create file");
            e.printStackTrace();
        }
    }
}