import java.util.Scanner;

/**
 * Created by V-Rod on 1/4/17.
 */
public class TableOfPowers {
    public static void main(String[] args) {
        Scanner squareCubeTable = new Scanner(System.in);
        int userInput;
        String userAnswer;

        //Welcome the user to the program


            System.out.println("Welcome to the Squares and Cubes Table.  The table will be able to display a table of " +
                    "squares and cubes from 1 to the value entered.");
            System.out.println();
        do {
            //Ask for input from user
            System.out.print("Please enter an integer: ");
            userInput = squareCubeTable.nextInt();


            //Create the table layout
            System.out.println("Number" + " " + " Squared" + " " + " Cubed");
            System.out.println("====== " + " " + "=======" + " " + " =====");

            //Iterate over the array
            for (int i = 1; i <= userInput; i++) {
                int resultSquared = (int) Math.pow(i, 2);
                int resultCubed = (int) Math.pow(i, 3);
                System.out.println(i  + "        " + resultSquared + "       " + resultCubed);
            }

            System.out.print("Would you like to run the program again?  Type yes or no: ");
            squareCubeTable.nextLine();
            userAnswer = squareCubeTable.nextLine();


        } while (userAnswer.equals("yes") || userAnswer.equals("y"));

        System.out.println("Thank you!");

    }
}
