import java.util.Scanner;

/**
 * Created by V-Rod on 1/9/17.
 */
public class DiceRollerApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userChoice = "no";

        System.out.println("Welcome to the dice roller application!");

        do {
            playGame(scan);
            System.out.println("Do you want to continue? Type 'yes' or 'no'");
            userChoice = scan.next();
        } while (userChoice.equalsIgnoreCase("yes"));
    }

    public static void playGame(Scanner scan) {
        //Ask the user to enter the number of sides for a pair of dice
        int numberOfSidesPerDie = getNumberOfSidesFromUser(scan);
        System.out.println("You have a " + numberOfSidesPerDie + " sided die...");

        //“Roll” two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.

        int dieOne = rollDie(numberOfSidesPerDie);
        int dieTwo = rollDie(numberOfSidesPerDie);

        System.out.println("You rolled a " + dieOne + " and a " + dieTwo + ".");
        System.out.println("Together, your total is " + (dieOne + dieTwo));
    }

    //Use static methods to implement the method(s) that generate the random numbers.

    public static int rollDie (int numberofSidesPerDie) {

        //Random number generation in Java

        return (int) Math.ceil(Math.random () * numberofSidesPerDie);
    }

    public static int getNumberOfSidesFromUser(Scanner scan) {
        System.out.print("How many sides does your dice have?");
        int sides = scan.nextInt();
        return sides;
    }
}

