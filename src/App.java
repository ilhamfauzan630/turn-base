import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String name, weapon;
        int health = 100; 
        int attack = 40;

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

        System.out.println("Loading game");
        for (int i = 0; i < 10; i++) {
            System.out.print(".");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Player player = new Player(name, weapon, health);
        Enemy enemy = new Enemy("Enemy", "Gun", 500);

        //crearscreen
        System.out.print("\033[H\033[2J");
        System.out.flush();

        

        System.out.println("Enemy name is " + enemy.getName());
        System.out.println("Enemy weapon is " + enemy.getWeapon());
        System.out.println("Enemy health is " + enemy.getHealth());

        System.out.println("\n\n\n");

        player.setAttack(attack);
        player.info();
        System.out.println();
        input.close();
    }
}
