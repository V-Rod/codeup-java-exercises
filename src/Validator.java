import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by V-Rod on 1/10/17.
 */
public class Validator {

    private Scanner sc;

    public Validator(Scanner sc) {
        this.sc = sc;
    }

    public int getInt(String prompt) {
        System.out.print(prompt);
        int userInteger;
        try {
            userInteger = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Your input must be an integer, nothing else!");

            // Keeps the scanner from "skipping" the next input
            sc.next();
            return getInt(prompt);
        }

        return userInteger;
    }

    public int getIntWithinRange(String prompt, int min, int max) {
        int userInteger = getInt(prompt);
        try {
            System.out.print(prompt);
            if (userInteger < min || userInteger > max)
                throw new IllegalArgumentException("Error! Number must be greater than " + min +
                        "and number must be less than " + max + ".");
        }catch (IllegalArgumentException e) {
            System.out.println("Your input must be an integer, nothing else!");

            // Keeps the scanner from "skipping" the next input
            sc.next();
            return getIntWithinRange(prompt, min, max);

        }
        return userInteger;
    }

    public double getDouble(String prompt) {
        double userDouble;
        try {
            System.out.print(prompt);
            userDouble = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.print("Error! Invalid decimal value. Try again. ");
            sc.next();
            return getDouble(prompt);
        }
        return userDouble;
    }

    public double getDoubleWithinRange(String prompt, int min, int max) {
        int userDouble = (int) getDouble(prompt);
        try {
            System.out.println(prompt);
            if (userDouble < min || userDouble > max)
                throw new IllegalArgumentException("Error! Number must be greater than " + min +
                " and number must be less than " + max + ".");
            } catch (IllegalArgumentException e) {
                System.out.println("Error! Invalid decimal value. Try again.");
                sc.next();
                return getDoubleWithinRange(prompt, min, max);
            }
        return userDouble;
    }

    public String getRequiredString(String prompt) {
        String inputString;

        try {
            System.out.print(prompt);
            inputString = sc.nextLine();
        } catch (Exception e) {
            System.out.print("Whoops, something went wrong");
            sc.next();
            return getRequiredString(prompt);
        }
        return inputString;
    }

    public static String getUserString(String prompt) {
        String string = "";
        boolean isValid = false;
        Scanner sc = new Scanner(System.in);
        while (!isValid) {
            System.out.print(prompt);
            string = sc.nextLine();
            if (!string.equals(""))
                isValid = true;
        }
        return string;
    }

    public static String getString(String prompt) {
        String string = null;
        boolean isValid = false;

        while (!isValid) {
            string = getUserString(prompt);
            if (string.compareTo("Y") == 0 || string.compareTo("y") == 0 || string.compareTo("N") == 0 || string.compareTo("n") == 0)
                isValid = true;
            else
                System.out.println("Error! Entry must be 'y' or 'n'. Try again.");
        }
        return string;
    }
}

//.contains
//.isEmpty
//.trim