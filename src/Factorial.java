import java.util.Scanner;

/**
 * Created by V-Rod on 1/5/17.
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userInteger;

        //Ask for input from user
        System.out.println("Welcome to the Java Factorial Calculator.");
        System.out.print("Please enter an integer between 1 and 10 to calculate its factorial: ");
        userInteger = sc.nextInt();

        int fact = 1;
        int factorialResult = factorial(userInteger, fact);

        System.out.println("The factorial for " + userInteger + " is " + factorialResult);

    }

    public static int factorial(int userInteger, int fact) {
        for (int i = 1; i <= userInteger; i++) {
            fact = fact * i;
        }
        return fact;
    }

}


//    String userAnswer;
//if (userInteger <= 0 && userInteger > 10){
//        System.out.println("The number entered has to be between 1 and 10.  Try again.");
//        } else { }

