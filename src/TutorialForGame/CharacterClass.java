package TutorialForGame;

import java.util.SortedMap;

public class CharacterClass {
    public static void main(String[] args) {

String [] Classes ={ "Warrior", "Rogue", "Wizard",  "Hunter", "Classless"};

        int stamina; // 4=60, 5 =70, 6=80, 7=90, 8=100, 9=110, 10=120 HP
        int attackmodifier; // 4=+20 (wizard), 3=+15 (hunter/rogue firste strike), 2=+10(warrior), 1=-10 (wounded?)
        int dogde; //rogue 3=10 %, warrior 2=5%, wizard 1=-10 %

boolean exit = true;
MENU:
while (exit) {
    System.out.println("#########################");
    System.out.println("Welcome to my first game!");
    System.out.println("#########################");

    System.out.println("Would you like to choose character(1) or would you like to exit(2)?");
    if (stamina==4) {
        health+0;
        System.out.println(health);}
    else if (stamina==5) {
        health+10;
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

    if (input.equals("1")) {
        System.out.println("Please Choose between: Warrior(0), Rogue(1), Wizard(2), Hunter(3), Classless(4)");
        if (input.equals("0")) {

        }else if (input.equals("1")) {
            stamina =8;
            System.out.println("You have selected a Warrior");
            System.out.println("You have " + (health)+ " HP " + (attackdamage*attackmodifier);
        }else if (input.equals("2")) {

        }else if (input.equals("3")) {

        }else if (input.equals("4")) {

        }else { System.out.println("invalid command!"); }




    }else if (input.equals("2")) {
        System.out.println("Thanks for playing!");
    }else {   System.out.println("Invalid command");}


}






    }




}
