import java.lang.ClassNotFoundException;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class App {
    public static void main(String[] args) throws Exception {
        String name, weapon;
        int health = 100;
        int attack = 40;
        Boolean isAlive = true;
        Boolean isEnemy = true;
        String language;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the game");
        System.out.println("1. English");
        System.out.println("2. Indonesia");
        System.out.print("Enter your language : ");
        language = input.nextLine();

        switch (language) {
            case "1":
                language = "English";
                break;
            case "2":
                language = "Indonesia";
                break;
            default:
                language = "English";
                break;
        }

        // clearscreen
        System.out.print("\033[H\033[2J");
        System.out.flush();

        if (language == "Indonesia") {
            System.out.print("Masukan nama anda: ");
            name = input.nextLine();
            System.out.println("Pilih senjata anda: ");
            System.out.println("1. Pedang");
            System.out.println("2. Pistol");
            System.out.println("3. Pisau");
            System.out.print("Masukan senjata anda: ");
            weapon = input.nextLine();
        } else {
            System.out.print("Enter your name: ");
            name = input.nextLine();
            System.out.println("choice your weapon: ");
            System.out.println("1. Sword");
            System.out.println("2. Gun");
            System.out.println("3. Knife");
            System.out.print("Enter your weapon: ");
            weapon = input.nextLine();
        }

        switch (weapon) {
            case "1":
                if (language == "Indonesia") {
                    weapon = "Pedang";
                } else {
                    weapon = "Sword";
                }
                attack += 10;
                break;
            case "2":
                if (language == "Indonesia") {
                    weapon = "Pistol";
                } else {
                    weapon = "Gun";
                }
                attack += 15;
                break;
            case "3":
                if (language == "Indonesia") {
                    weapon = "Pisau";
                } else {
                    weapon = "Knife";
                }
                attack += 5;
                break;
            default:
                if (language == "Indonesia") {
                    weapon = "Pedang";
                } else {
                    weapon = "Sword";
                }
                attack += 10;
                break;
        }

        // clearscreen
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Charakter charakter = new Charakter(name, weapon, health);
        charakter.setLanguage(language);
        System.out.println("info :");
        charakter.info();

        System.out.println("\nLoading game");
        for (int i = 0; i < 6; i++) {
            System.out.print(".");
            if (i == 5) {
                // clearscreen
                System.out.print("\033[H\033[2J");
                System.out.flush();
                if (language == "Indonesia") {
                    System.out.println("Battle dimulai!!");
                } else {
                    System.out.println("battle start!!");
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // instance player/enemy
        Player player = new Player(name, weapon, health, isAlive);
        Enemy enemy = new Enemy("Kraken", "Gun", 250, isAlive);

        // crearscreen
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // info player/enemy
        enemy.setAttack(attack);
        enemy.setEnemy(isEnemy);
        enemy.info();
        System.out.println("\n\n\n");
        player.setAttack(attack);
        player.setEnemy(isEnemy);
        player.info();

        if (language == "Indonesia") {
            while (player.isAlive == true && enemy.isAlive == true) {

                System.out.println("1. Serang");
                System.out.println("2. Gunakan Skill");
                System.out.println("3. Lari");
                System.out.print("Pilih Opsi : ");
                String choice = input.nextLine();

                switch (choice) {
                    case "1":

                        // clearscreen
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        // player attack
                        enemy.health -= player.attack();

                        System.out.println("Seranganmu : " + player.attack());
                        System.out.println("\nsisa darah musuh : " + enemy.health);
                        for (int i = 0; i < 6; i++) {
                            System.out.print(".");
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        // clearscreen
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        // enemy attack
                        player.health -= enemy.attack();

                        System.out.println("Serangan Musuh : " + enemy.attack());
                        System.out.println("\nSisa Darah Mu : " + player.health);
                        try {
                            Thread.sleep(900);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        // info player and enemy
                        enemy.setAttack(attack);
                        enemy.setEnemy(isEnemy);
                        enemy.info();
                        System.out.println("\n\n\n");
                        player.setAttack(attack);
                        player.setEnemy(isEnemy);
                        player.info();
                        break;

                    case "2":
                        // clearscreen
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("Menggunakan kemampuan " + weapon);
                        try {
                            Thread.sleep(900);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        // clearscreen
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        enemy.health -= player.attack();

                        System.out.println("Serangan Mu : " + player.attack());
                        System.out.println("Sisa Darah Musuh : " + enemy.health);
                        for (int i = 0; i < 6; i++) {
                            System.out.print(".");
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        // clearscreen
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        // clearscreen
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        player.health -= enemy.attack();

                        System.out.println("Serangan Musuh : " + enemy.attack());
                        System.out.println("Sisa Darah Mu : " + player.health);
                        try {
                            Thread.sleep(900);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        
                        // clearscreen
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        // info player and enemy
                        enemy.setAttack(attack);
                        enemy.setEnemy(isEnemy);
                        enemy.info();
                        System.out.println("\n\n\n");
                        player.setAttack(attack);
                        player.setEnemy(isEnemy);
                        player.info();
                        break;

                    case "3":
                        // clearscreen
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("you run away");
                        System.exit(0);
                        break;

                    default:
                        // clearscreen
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("you run away");
                        System.exit(0);
                        break;

                }
                if (player.health <= 0) {
                    player.isAlive = false;
                    System.out.println("you lose");
                    System.exit(0);

                } else if (enemy.health <= 0) {
                    enemy.isAlive = false;

                    // log battle
                    FileInput fi = new FileInput(name, "Kraken", weapon, attack, health);
                    fi.logBattle();

                    System.out.println("Kamu Menang");
                    System.exit(0);
                }
            }

        } else {
            while (player.isAlive == true && enemy.isAlive == true) {

                System.out.println("1. Attack");
                System.out.println("2. Skill");
                System.out.println("3. Run");
                System.out.print("Enter your choice: ");
                String choice = input.nextLine();

                switch (choice) {
                    case "1":

                        // clearscreen
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        // player attack
                        enemy.health -= player.attack();
                        System.out.println("your attack: " + player.attack());
                        System.out.println("enemy health: " + enemy.health);
                        try {
                            Thread.sleep(900);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        // clearscreen
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        // enemy attack
                        player.health -= enemy.attack();
                        System.out.println("enemy attack: " + enemy.attack());
                        System.out.println("your health: " + player.health);
                        try {
                            Thread.sleep(900);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        // info player and enemy
                        enemy.setAttack(attack);
                        enemy.setEnemy(isEnemy);
                        enemy.info();
                        System.out.println("\n\n\n");
                        player.setAttack(attack);
                        player.setEnemy(isEnemy);
                        player.info();
                        break;

                    case "2":
                        // clearscreen
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("using " + weapon + " skill");
                        try {
                            Thread.sleep(900);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        // clearscreen
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("your attack: " + player.attack());
                        System.out.println("enemy health: " + enemy.health);
                        enemy.health -= player.attack();
                        try {
                            Thread.sleep(900);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        // clearscreen
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        // clearscreen
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("enemy attack: " + enemy.attack());
                        System.out.println("your health: " + player.health);
                        player.health -= enemy.attack();
                        try {
                            Thread.sleep(900);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        // clearscreen
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        // info player and enemy
                        enemy.setAttack(attack);
                        enemy.setEnemy(isEnemy);
                        enemy.info();
                        System.out.println("\n\n\n");
                        player.setAttack(attack);
                        player.setEnemy(isEnemy);
                        player.info();
                        break;

                    case "3":
                        // clearscreen
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("you run away");
                        System.exit(0);
                        break;

                    default:
                        // clearscreen
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("you run away");
                        System.exit(0);
                        break;

                }
                if (player.health <= 0) {
                    player.isAlive = false;
                    System.out.println("you lose");
                    System.exit(0);

                } else if (enemy.health <= 0) {
                    enemy.isAlive = false;

                    // log battle
                    FileInput fi = new FileInput(name, "Kraken", weapon, attack, health);
                    fi.logBattle();

                    System.out.println("you win");
                    System.exit(0);
                }
            }
        }

        input.close();

    }

}
