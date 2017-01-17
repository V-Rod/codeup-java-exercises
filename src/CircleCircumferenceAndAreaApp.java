import java.util.Scanner;

/**
 * Created by V-Rod on 1/17/17.
 */
public class CircleCircumferenceAndAreaApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);

        /* declare variables */
        double userInputRadius;
        String proceed;

        /* Welcome the user to the application */
        System.out.println("Welcome to the Circumference and Area Calculator!");
        System.out.println();

        do{
            /* Ask user for input and create a new circle object */
            userInputRadius = validator.getDouble("Please enter the radius of the circle: ");
            Circle circle = new Circle(userInputRadius);

            /* Calculate and display the circumference and the area of the circle*/
            System.out.println("The circumference of the circle is " + circle.getFormattedCircumference() + ".");
            System.out.println("The area of the circle is " + circle.getFormattedArea() + ".");
            System.out.println();

            /* Ask the user if they would like to continue */
            scan.nextLine();
            System.out.println("Would you like to find out the circumference or area of another circle?");
            proceed = validator.getRequiredString("Please type YES or NO and hit the ENTER button. ");
            System.out.println();

        } while (proceed.equalsIgnoreCase( "yes") || proceed.equalsIgnoreCase("y"));

        System.out.println();
        System.out.println("You created " + Circle.circlesCreated + " circles.");
        System.out.println("Goodbye! Thank you for using the Circumference and Area Calculator brought to you by Codeup!");

    }

}
