import java.util.Scanner;

/**
 * Created by V-Rod on 1/9/17.
 */
public class DiceRollingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userChoice = "no";

        System.out.println("Welcome to the dice roller application!");

        do {
            rollTwoDice(sc);
            System.out.println("Do you want to continue? Type 'yes' or 'no'");
            userChoice = sc.nextLine();
        } while (userChoice.equalsIgnoreCase("yes"));



    }

    public static void rollTwoDice(Scanner sc) {
        int numberOfSides;

        //Ask the user to enter the number of sides for the numberOfSides

        System.out.print("Enter the number of sides on the dice: ");
        numberOfSides = sc.nextInt();
        sc.nextLine();

        // Create the objects and roll two dice with the numberOfSides
        DiceObject firstDice = new DiceObject(numberOfSides);
        firstDice.rollDice();
        System.out.println("You rolled a " + firstDice.currentValue + " on the first dice.");

        DiceObject secondDice = new DiceObject(numberOfSides);
        secondDice.rollDice();
        System.out.println("You rolled a " + secondDice.currentValue + " on the second dice.");

    }


}
