package TutorialForGame;

import javax.swing.*;
import java.util.SortedMap;

public class CharacterClass {
    public static void main(String[] args) {

String [] Class ={ "Warrior", "Rogue", "Wizard",  "Hunter", "Classless"};

        int stamina; // 4=60, 5 =70, 6=80, 7=90, 8=100, 9=110, 10=120 HP
        int attackmodifier; // 4=+20 (wizard), 3=+15 (hunter/rogue first strike), 2=+10(warrior), 1=-10 (wounded?)
        int dogde; //rogue 3=20 %, warrior 2=12%, wizard 1=-10 %. base 0=6% avoiding % damage

boolean exit = true;
MENU:
while (exit) {
    System.out.println("#########################");
    System.out.println("Welcome to my first game!");
    System.out.println("#########################");

    System.out.println("Would you like to choose character(1) or would you like to exit(2)?");

    //creating the health difference, so that i can be changes after selection of class and through level up (if created)
    if (stamina==4) {
        health+0;
        System.out.println(health);}
    else if (stamina==5) {
        health+10;
        //TODO health+10=int maxHealth
        System.out.println(health);}
    else if (stamina==6) {
        health+20;
        System.out.println(health);}
    else if (stamina==7) {
        health+30;
        System.out.println(health);}
    else if (stamina==8) {
        heath+40;
        System.out.println(health);}
    else if (stamina==9) {
        health+50;
        System.out.println(health);}
    else if (stamina==10) {
        health+60;
        System.out.println(health);}
    else if (stamina==11) {
        health+70;
        System.out.println(health);}
    else if (stamina==12) {
        health+80;
        System.out.println(health);}
    else if (stamina==13) {
        health+90;
        System.out.println(health);}
    else if (stamina==14) {
        health+100;
        System.out.println(health);}
    else {System.out.println("you have reached maxium health!");}

    //creating the values for the different attackmodifiers
    if (attackmodifier==1) {
        attackDamage-10; }
    else if (attackmodifier==2) {
        attackDamage+10; }
    else if (attackmodifier==3) {
        attackDamage+15; }
    else if (attackmodifier==4) {
        attackDamage+20;}
    else { attackDamage+5;}

    //dogde, making the enemy attack have small chance of faliure
    //TODO might need to be this instead (health -= damageTaken*dodge);
    if (dogde==1) {
        damageTaken = damageTaken*1.1;
    }else if (dogde==2) {
        damageTaken = damageTaken*0.88;
    }else if (dogde==3) {
        damageTaken = damageTaken*0.8;
    } else {damageTaken = damageTaken*0.94;}

    if (input.equals("1")) {
        System.out.println("Please Choose between: Warrior(0), Rogue(1), Wizard(2), Hunter(3), Classless(4)");
        if (input.equals("0")) {
            stamina =8;
            attackmodifier=2;
            dogde = 2;
            System.out.println("You have selected a Warrior!");
            System.out.println("You have " + (health)+ " HP " + (attackDamage + attackmodifier) + " Attack Damage";
        }else if (input.equals("1")) {
            stamina =6;
            attackmodifier=3;
            dogde = 3;
            System.out.println("You have selected a Rogue!");
            System.out.println("You have " + (health)+ " HP " + (attackDamage + attackmodifier) + " Attack Damage";
        }else if (input.equals("2")) {
            stamina =7;
            attackmodifier=4;
            dogde = 1;
            System.out.println("You have selected a Wizard!");
            System.out.println("You have " + (health)+ " HP " + (attackDamage + attackmodifier) + " Attack Damage";
        }else if (input.equals("3")) {
            stamina =7;
            attackmodifier=3;
            dogde = 2;
            System.out.println("You have selected a Hunter!");
            System.out.println("You have " + (health)+ " HP " + (attackDamage + attackmodifier) + " Attack Damage";
        }else if (input.equals("4")) {
            stamina =8;
            System.out.println("You have selected the Classless adventure!");
            System.out.println("You have " + (health)+ " HP " + (attackDamage + attackmodifier) + " Attack Damage";
        }else { System.out.println("invalid command!"); }




    }else if (input.equals("2")) {
        System.out.println("Thanks for playing!");
        break MENU;
    }else {   System.out.println("Invalid command");}


}






    }




}
