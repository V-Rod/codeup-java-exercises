/**
 * Created by V-Rod on 1/9/17.
 */
public class Student {

    private String firstName;
    private String lastName;
    private double score;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getScore() {
        return score;
    }

    public Student (String firstName, String lastName, double score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }


    public String getFullName() {
        return firstName + " " + lastName;
    }
}
