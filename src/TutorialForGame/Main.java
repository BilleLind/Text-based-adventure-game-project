package TutorialForGame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System objects
        Scanner in = new Scanner(System.in);
        Random rand = new Random(); // makes random numbers
        Random rand2 = new Random(); //  if rand used right after another would be same number therefore rand2.
        Random rand3 = new Random();

        // Game variables
        String[] enemies = {"Skeleton", "Zombie", "Warroir", "Assasin"};
        int maxEnemyHealth = 45;
        int enemyAttackDamage = 25;

        //player variables
        int health = 60;
        int attackDamage = 20;
        int numHealthPotions = 3;
        int healthPotionHealAmount = 30;
        int healthPotionDropChance = 35; //percentage for drop, after killing monster
        int numberDefeted =0;

        String [] Class ={ "Warrior", "Rogue", "Wizard",  "Hunter", "Classless"};

        boolean notWounded =true;
        int woundedChance = 5; // percentage for getting wounded after attacked
        int stamina =0; // 4=60, 5 =70, 6=80, 7=90, 8=100, 9=110, 10=120 HP
        int attackmodifier =0; // 4=+20 (wizard), 3=+15 (hunter/rogue first strike), 2=+10(warrior), 1=-10 (wounded?)
        int dogde =0; //rogue 3=20 %, warrior 2=12%, wizard 1=-10 %. base 0=6% avoiding % damage
        int playerHealth = 0;
        int ten = 10; int zero = 0; int twenty = 20; int thirthy =30; int forthy = 40; int fifty = 50; int sixty =60;
        int seventy =70; int eighty = 80; int ninety = 90; int hundred = 100;int fiften =15; int five = 5;
        double oneFifth =0.8; double oneEight =0.88; double oneTenth =0.9; double hundredMinusSix = 0.94; double oneOneZero =1.1;
        boolean exit = true;

        MENU:
        while (exit) {
            System.out.println("#########################");
            System.out.println("Welcome to my first game!");
            System.out.println("#########################");

            System.out.println("Would you like to choose character(1) or would you like to exit(2)?");

            //creating the health difference, so that i can be changes after selection of class and through level up (if created)
            if (stamina==4) {
                health = playerHealth;
                playerHealth = health + zero;
                System.out.println(playerHealth);}
            else if (stamina==5) {
                health= playerHealth;
                playerHealth = health + ten;
                System.out.println(playerHealth);}
            else if (stamina==6) {
                health= playerHealth;
                playerHealth = health + twenty;
                System.out.println(playerHealth);}
            else if (stamina==7) {
                health = playerHealth;
                playerHealth = health +thirthy;
                System.out.println(playerHealth);}
            else if (stamina==8) {
                health= playerHealth;
                playerHealth = health + forthy;
                System.out.println(playerHealth);}
            else if (stamina==9) {
                health = playerHealth;
                playerHealth = health + fifty;
                System.out.println(playerHealth);}
            else if (stamina==10) {
                health = playerHealth;
                playerHealth = health + sixty;
                System.out.println(playerHealth);}
            else if (stamina==11) {
                health = playerHealth;
                playerHealth = health + seventy;
                System.out.println(playerHealth);}
            else if (stamina==12) {
                health = playerHealth;
                playerHealth = health + eighty;
                System.out.println(playerHealth);}
            else if (stamina==13) {
                health = playerHealth;
                playerHealth = health +ninety;
                System.out.println(playerHealth);}
            else if (stamina==14) {
                health = playerHealth;
                playerHealth = health + hundred;
                System.out.println(playerHealth);}
            else {System.out.println("you have reached maxium health!");}

            //creating the values for the different attackmodifiers
            if (attackmodifier==1) {
                ten -= attackDamage; }
            else if (attackmodifier==2) {
               ten += attackDamage; }
            else if (attackmodifier==3) {
               fiften += attackDamage; }
            else if (attackmodifier==4) {
                twenty += attackDamage;}
            else { five += attackDamage;}




            String input = in.nextLine();

            while (!input.equals("1") && !input.equals("2")) {
                System.out.println("Invalid command!");
                input = in.nextLine();
            if (input.equals("1")) {
                System.out.println("Please Choose between: Warrior(0), Rogue(1), Wizard(2), Hunter(3), Classless(4)");

            }else if (input.equals("2")) {
                System.out.println("Thanks for playing!");
                break MENU;
            }else { System.out.println("Invalid command");}

                String entered = in.nextLine();
           while (!entered.equals("2") &&!entered.equals("3") && !entered.equals("4") && !entered.equals("0") && !entered.equals("1")) {
               System.out.println("Invalid command!");
               input = in.nextLine();
           }
               //switch instead? or will it work :/
                // attackDamage + attackmodifier changed to something else considering other varibles input elsewhere
                if (entered.equals("0")) {
                    stamina =8 ;
                    attackmodifier=2;
                    dogde = 2;
                    System.out.println("You have selected a Warrior!");
                    System.out.println("You have " + (playerHealth)+ " HP " + (attackDamage + attackmodifier) + " Attack Damage";
                }else if (entered.equals("1")) {
                    stamina =6;
                    attackmodifier=3;
                    dogde = 3;
                    System.out.println("You have selected a Rogue!");
                    System.out.println("You have " + (playerHealth)+ " HP " + (attackDamage + attackmodifier) + " Attack Damage";
                }else if (entered.equals("2")) {
                    stamina =7;
                    attackmodifier=4;
                    dogde = 1;
                    System.out.println("You have selected a Wizard!");
                    System.out.println("You have " + (playerHealth)+ " HP " + (attackDamage + attackmodifier) + " Attack Damage";
                }else if (entered.equals("3")) {
                    stamina =7;
                    attackmodifier=3;
                    dogde = 2;
                    System.out.println("You have selected a Hunter!");
                    System.out.println("You have " + (playerHealth)+ " HP " + (attackDamage + attackmodifier) + " Attack Damage";
                }else if (entered.equals("4")) {
                    stamina =8;
                    System.out.println("You have selected the Classless adventure!");
                    System.out.println("You have " + (playerHealth)+ " HP " + (attackDamage + attackmodifier) + " Attack Damage";
                }else { System.out.println("invalid command!"); }




            boolean running = true;

        System.out.println("Welcome to the dungeon!");

        GAME:
        while (running) {
            System.out.println("---------------------------------------------------------");

            int enemyHealth = rand.nextInt(maxEnemyHealth);
            String enemy = enemies[rand.nextInt(enemies.length)];
            System.out.println("\t# " + enemy + " has appeared! #\n");

            while (enemyHealth > 0) {
                System.out.println("\tYour HP: " + playerHealth);
                System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Attacl");
                System.out.println("\t2. Drink health potion");
                System.out.println("\t3. Run!");

                String input = in.nextLine();
                if (input.equals("1")) {
                    int damageDealt = rand.nextInt(attackDamage);
                    int damageTaken = rand2.nextInt(enemyAttackDamage);
                    if (dogde==1) {
                        oneOneZero *= damageTaken;
                    }else if (dogde==2) {
                       ten *= damageTaken;
                    }else if (dogde==3) {
                    twenty *= damageTaken;
                    } else {hundredMinusSix *= damageTaken;}

                    enemyHealth -= damageDealt;
                   playerHealth -= damageTaken;

                    System.out.println("\t> Your strike the " + enemy + " for " + damageDealt + " Damage.");
                    System.out.println("\t> You received " + damageDealt + " in retaliation!");

                    if ( playerHealth < 1) {
                        System.out.println("\t> You have taken to much damage, you are too weak to go on!");
                        break;      }
                    else if (enemyHealth < 1) {
                        numberDefeted++;
                    }
                                        //TODO make sure to not let health potion go beyond health (class wise)
                }else if (input.equals("2")) {
                    if (numHealthPotions > 0) {
                        playerHealth += healthPotionHealAmount;
                        numHealthPotions --;
                        System.out.println("\t> You drink a health potion, healing yourself for " +  "."
                                    + "\n\t> You have now have " +  playerHealth + " HP."
                                    +   "\n\t> You have " + numHealthPotions + "health potion left. \n");

                         }else {
                                System.out.println("\t> you have no health potions left! Defeat enemies for a drop chance of one"); }

                }else if (input.equals("3")) {
                    System.out.println("\tYour run away from the " + enemy + "!");
                    continue GAME;

                }else {
                    System.out.println("\tInvalid command!"); }



            }
            if ( playerHealth <1) {
                System.out.println("You limp out of the dungeon, weak from battle.");
                break;     }
//TODO use lune 218 (healthpotion dropchance) for chance getting wounded (3% for 1 round)
            System.out.println("---------------------------------------------------------");
            System.out.println(" # "+ enemy + " was defeated! # ");
            System.out.println(" # You have " +  playerHealth + " HP left #");
            if (rand.nextInt(100) < healthPotionDropChance) {
                numHealthPotions ++;
                System.out.println(" # The" + enemy + " dropped a health potion");
                System.out.println(" # You now have " + numHealthPotions + " health potion(s). # ");
            }
            System.out.println("---------------------------------------------------------");
            System.out.println("What would you like to do now?");
            System.out.println("1. continue fighting");
            System.out.println("2. Exit Dungeon");

            String input = in.nextLine();

            while (!input.equals("1") && !input.equals("2")) {
                System.out.println("Invalid command!");
                input = in.nextLine();
            }
            if (input.equals("1")) {
                System.out.println("You continue on your adventure!");
            }else if (input.equals("2")) {
                System.out.println("You exit the dungeon, successful from your adventure!");
                System.out.println("You have deafeted " + numberDefeted + " enemies!");
                break;
            }

        }
        System.out.println("###############################");
        System.out.println("##### ThANKS FOR PLAYING! #####");
        System.out.println("###############################");

    }

}
}