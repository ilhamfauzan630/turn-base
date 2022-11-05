import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String name, weapon;
        int health = 100; 
        int attack = 40;
        Boolean isAlive = true;
        Boolean isEnemy = true;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.println("choice your weapon: ");
        System.out.println("1. Sword");
        System.out.println("2. Gun");
        System.out.println("3. Knife");
        System.out.print("Enter your weapon: ");
        weapon = input.nextLine();

        switch (weapon) {
            case "1":
                weapon = "Sword";
                attack += 10;
                break;
            case "2":
                weapon = "Gun";
                attack += 15;
                break;
            case "3":
                weapon = "Knife";
                attack += 5;
                break;
            default:
                weapon = "Sword";
                attack += 10;
                break;
        }
        
        //clearscreen
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        
        Charakter charakter = new Charakter(name, weapon, health);
        System.out.println("info :");
        charakter.info();
        
        System.out.println("\nLoading game");
        for (int i = 0; i < 6; i++) {
            System.out.print(".");
            if(i == 5){
                //clearscreen
        System.out.print("\033[H\033[2J");
        System.out.flush();
                System.out.println("battle start!!");
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //instance player and enemy
        Player player = new Player(name, weapon, health);
        Enemy enemy = new Enemy("Enemy", "Gun", 500);

        //crearscreen
        System.out.print("\033[H\033[2J");
        System.out.flush();

        
        //set attack
        enemy.setAttack(attack);
        enemy.setEnemy(isEnemy);
        enemy.info();

        System.out.println("\n\n\n");

        //set attack
        player.setAttack(attack);
        player.setEnemy(isEnemy);
        player.info();
        

        input.close();
    }
}
