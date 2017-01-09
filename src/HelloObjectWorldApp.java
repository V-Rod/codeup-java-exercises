import java.util.Scanner;

/**
 * Created by V-Rod on 1/6/17.
 */
public class HelloObjectWorldApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Person newPerson1 = new Person(getFirstName(scan), getLastName(scan), getEmail(scan));
        System.out.println("Hello " + newPerson1.getFirstName()+ " " + newPerson1.getLastName() + ", " + "we have your " +
                "email as " + newPerson1.getEmail() + ".");
        System.out.println(newPerson1);

        Person newPerson2 = new Person(getFirstName(scan), getLastName(scan), getEmail(scan));
        System.out.println("Hello " + newPerson2.getFirstName() + " " + newPerson2.getLastName()+ ", " + "we have your " +
                "email as " + newPerson2.getEmail() + ".");
        System.out.println(newPerson2);

        Person newPerson3 = new Person(getFirstName(scan), getLastName(scan), getEmail(scan));
        System.out.println("Hello " + newPerson3.getFirstName() + " " + newPerson3.getLastName() + ", " + "we have your " +
                "email as " + newPerson3.getEmail() + ".");
        System.out.println(newPerson3);
    }

    public static String getFirstName(Scanner scan){
        System.out.print("Please enter your first name: ");
        return scan.nextLine();
    }

    public static String getLastName(Scanner scan) {
        System.out.print("Please enter your last name: ");
        return scan.nextLine();
    }

    public static String getEmail(Scanner scan) {
        System.out.print("Please enter your email: ");
        return scan.nextLine();
    }
}
