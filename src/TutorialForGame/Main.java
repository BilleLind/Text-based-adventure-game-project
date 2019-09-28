package TutorialForGame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System objects
        Scanner in = new Scanner(System.in);
        Random rand = new Random(); // makes random numbers
        Random rand2 = new Random(); //  if rand used right after another would be same number therefore rand2.

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

        boolean running = true;

        System.out.println("Welcome to the dungeon!");

        GAME:
        while (running) {
            System.out.println("---------------------------------------------------------");

            int enemyHealth = rand.nextInt(maxEnemyHealth);
            String enemy = enemies[rand.nextInt(enemies.length)];
            System.out.println("\t# " + enemy + " has appeared! #\n");

            while (enemyHealth > 0) {
                System.out.println("\tYour HP: " + health);
                System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Attacl");
                System.out.println("\t2. Drink health potion");
                System.out.println("\t3. Run!");

                String input = in.nextLine();
                if (input.equals("1")) {
                    int damageDealt = rand.nextInt(attackDamage);
                    int damageTaken = rand2.nextInt(enemyAttackDamage);

                    enemyHealth -= damageDealt;
                    health -= damageTaken;

                    System.out.println("\t> Your strike the " + enemy + " for " + damageDealt + " Damage.");
                    System.out.println("\t> You received " + damageDealt + " in retaliation!");

                    if (health < 1) {
                        System.out.println("\t> You have taken to much damage, you are too weak to go on!");
                        break;      }
                    else if (enemyHealth < 1) {
                        numberDefeted++;
                    }

                }else if (input.equals("2")) {
                    if (numHealthPotions > 0) {
                        health += healthPotionHealAmount;
                        numHealthPotions --;
                        System.out.println("\t> You drink a health potion, healing yourself for " +  "."
                                    + "\n\t> You have now have " + health + " HP."
                                    +   "\n\t> You have " + numHealthPotions + "health potion left. \n");

                         }else {
                                System.out.println("\t> you have no health potions left! Defeat enemies for a drop chance of one"); }

                }else if (input.equals("3")) {
                    System.out.println("\tYour run away from the " + enemy + "!");
                    continue GAME;

                }else {
                    System.out.println("\tInvalid command!"); }



            }
            if (health <1) {
                System.out.println("You limp out of the dungeon, weak from battle.");
                break;     }

            System.out.println("---------------------------------------------------------");
            System.out.println(" # "+ enemy + " was defeated! # ");
            System.out.println(" # You have " + health + " HP left #");
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
