import java.util.*;

/**
 * Created by V-Rod on 1/16/17.
 */
public class ListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validator validator = new Validator(sc);

        // declare variables
        String studentLastName;
        String studentFirstName;
        double studentScore;
        String proceed;

        // create the ArrayList to store the Student Class objects created
        ArrayList<Student> studentReports = new ArrayList<Student>();

        // welcome user to the application
        System.out.println("Welcome to the Student Finder Application");

        do {
            // ask user for student input (first name, last name, score)
            studentFirstName = validator.getRequiredString("What is the student's first name? ");
            studentLastName = validator.getRequiredString("What is the student's last name? ");
            studentScore = validator.getDouble("What is the student's score? ");

            // create a new Student object to store the user input
            Student student = new Student(studentFirstName, studentLastName, studentScore);
            studentReports.add(student);

            // iterating across an ArrayList using a "for" loop
            for (int i = 0; i < studentReports.size(); i++) {
                System.out.println(studentReports.get(i).getFullName());
                System.out.println(studentReports.get(i).getScore());
            }

            sc.nextLine();
            proceed = validator.getRequiredString("Would you like to add another student? ");

        } while (proceed.equalsIgnoreCase("y"));

    }
}
