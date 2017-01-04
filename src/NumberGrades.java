import java.util.Scanner;

/**
 * Created by V-Rod on 1/4/17.
 */
public class NumberGrades {
    public static void main(String[] args) {
        Scanner tableGrades = new Scanner(System.in);

        int numericalGrade;
        String userAnswer;


        //Welcome the user
        System.out.println("Welcome to the Table of Grades program");
        System.out.println();


        do {
            //Prompt the user for a numerical grade
            System.out.print("Please enter the numerical value: ");
            numericalGrade = tableGrades.nextInt();

            if (numericalGrade >= 99) {
                System.out.println("The grade for the student is A+.");
            } else if (numericalGrade >= 88 && numericalGrade < 99) {
                System.out.println("The grade for the student is A.");
            } else if (numericalGrade >= 86 ) {
                System.out.println("The grade for the student is B+.");
            } else if (numericalGrade >= 80) {
                System.out.println("The grade for the student is B.");
            } else if (numericalGrade >= 78){
                System.out.println("The grade for the student is C+.");
            } else if (numericalGrade >= 67) {
                System.out.println("The grade for the student is C.");
            } else if (numericalGrade >= 60) {
                System.out.println("The grade for the student is D.");
            } else {
                System.out.println("The grade for the student is F.");
            }

            //Ask if the user wants to continue
            System.out.print("Would you like to run the program again?  Type yes or no: ");
            tableGrades.nextLine();
            userAnswer = tableGrades.nextLine();

        } while (userAnswer.equals("yes") || userAnswer.equals("y"));

        System.out.println("Thank you!");
    }
}
