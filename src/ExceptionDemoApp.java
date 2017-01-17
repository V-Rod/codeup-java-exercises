import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by V-Rod on 1/9/17.
 */
public class ExceptionDemoApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Welcome user to the application
        System.out.println("Welcome to the Student Records Application.");

        Student newStudent = new Student(getFirstName(scan), getLastName(scan), getAge(scan));
        System.out.println("You entered: " + newStudent.getFirstName() + " " + newStudent.getLastName());

    }

    public static String getFirstName(Scanner scan) {
        try {
            System.out.print("Please enter the first name of the student: ");
            return scan.nextLine();
        } catch (NoSuchElementException | IllegalStateException e) {
            System.out.println("Please enter a valid input such as a first name.");
            return scan.nextLine();
        }
    }

    public static String getLastName(Scanner scan) {
        System.out.print("Please enter the last name of the student: ");
        return scan.nextLine();
    }

    public static int getAge(Scanner scan) {
        try {
            System.out.print("Please enter the age of the student: ");
            return scan.nextInt();
        } catch (InputMismatchException e){
            scan.next();
            System.out.println("Please enter a valid input such as an integer.");
            return getAge(scan);
        }

    }
}
