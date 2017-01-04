import java.util.Scanner;

/**
 * Created by V-Rod on 1/3/17.
 */
public class UserInputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput;
        Integer userInt;
        String userSentence;
        String firstInput;
        String secondInput;
        String thirdInput;
        Double length;
        Double width;
        Double height;
        String userAnswer;


        do {
            System.out.print("Please input something: ");
            userInput = sc.nextLine();
            System.out.println("You enterered " + userInput);

            System.out.print("Please enter an integer: ");
            userInt = sc.nextInt();
            System.out.println("You entered " + userInt);

            //Make sure to not skip the next input
            sc.nextLine();


            System.out.print("Input a sentence: ");
            userSentence = sc.nextLine();
            System.out.println("You entered " + userSentence + ".");


            System.out.print("Please enter a word: ");
            firstInput = sc.next();
            System.out.println("Your first word is " + firstInput + ". ");

            System.out.print("Please enter a second word: ");
            secondInput = sc.next();
            System.out.println("Your second word is " + secondInput + ". ");

            System.out.print("Please enter a third word: ");
            thirdInput = sc.next();
            System.out.println("Your third word is " + thirdInput + ". ");


            System.out.println("Next, we will calculate the area, perimeter, and volumen of a room. ");


            System.out.print("Enter the room's length: ");
            length = sc.nextDouble();
            System.out.print("Enter the room's width: ");
            width = sc.nextDouble();
            System.out.print("Enter the room's height: ");
            height = sc.nextDouble();

            System.out.println("The perimeter of the room is: " + 2 * (length + width) + ". ");

            System.out.println("The area of the room is: " + (length * width) + " feet. ");

            System.out.println("The volume of the room is: " + (length * width * height) + ". ");

            //Make sure to not skip the next input
            sc.nextLine();


            System.out.print("Would you like to run the program again?  Type yes or no: ");
            userAnswer = sc.nextLine();

        } while (userAnswer.equals("yes") || userAnswer.equals("y"));

        System.out.println("Thank you!");


    }
}
