import java.util.Scanner;

/**
 * Created by V-Rod on 1/3/17.
 */
public class UserInputDemo {
    public static void main(String[] args) {
//        String userInput;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Please input something: ");
//        userInput = sc.nextLine();
//        System.out.println("You enterered " + userInput);

//        Integer userInt;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Please enter an integer: ");
//        userInt = sc.nextInt();
//        System.out.println("You entered " + userInt);

//        String userSentence;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Input a sentence: ");
//        userSentence = sc.nextLine();
//        System.out.print("You entered " + userSentence);

//        String firstInput;
//        String secondInput;
//        String thirdInput;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Please enter a word: ");
//        firstInput = sc.nextLine();
//        System.out.print("Your first word is " + firstInput + ". ");
//
//        System.out.print("Please enter a second word: ");
//        secondInput = sc.nextLine();
//        System.out.print("Your second word is " + secondInput + ". ");
//
//        System.out.print("Please enter a third word: ");
//        thirdInput = sc.nextLine();
//        System.out.print("Your third word is " + thirdInput + ".");

        Double length;
        Double width;
        Double height;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the room's length: ");
//        length = sc.nextDouble();
//        System.out.print("Enter the room's width: ");
//        width = sc.nextDouble();
//        System.out.print("The perimeter of the room is: " + 2 * (length + width));

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the room's length: ");
//        length = sc.nextDouble();
//        System.out.print("Enter the room's width: ");
//        width = sc.nextDouble();
//        System.out.print("The area of the room is: " + (length * width) + " feet.");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the room's length: ");
        length = sc.nextDouble();
        System.out.print("Enter the room's width: ");
        width = sc.nextDouble();
        System.out.print("Enter the room's height: ");
        height = sc.nextDouble();
        System.out.print("The volume of the room is: " + (length * width * height) + ". ");

        String userInput;

        System.out.print("Would you like to continue?  Type yes or no: ");
        userInput = sc.nextLine();

    }
}
