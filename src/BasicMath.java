/**
 * Created by V-Rod on 1/5/17.
 */

import java.util.Scanner;

/** Create four separate methods. Each will perform an arithmetic operation:
 * Addition
 * Subtraction
 * Multiplication
 * Division
 * Each function needs to take two parameters/arguments so that the operation can be performed.
 * Test your functions and verify the output.
 * Add a modulus function that finds the modulus of two numbers.
 */

public class BasicMath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstInteger = getFirstInteger(sc);
        int secondInteger = getSecondInteger(sc);
        int addResult = add(firstInteger, secondInteger);
        int subResult = sub(firstInteger, secondInteger);
        int mulResult = mult(firstInteger, secondInteger);
        double divResult = div(firstInteger, secondInteger);
        int modResult = mod(firstInteger, secondInteger);

        //Code here will parse the results and print them out in the console
        System.out.println("The result of the operation is as follows: ");
        System.out.println("The result for the addition " + "equals " + addResult);
        System.out.println("The result for the subtraction " + "equals " + subResult);
        System.out.println("The result for the multiplication " + "equals " + mulResult);
        System.out.println("The result for the division " + "equals " + divResult);
        System.out.println("The result for the modulo " + "is " + modResult);

    }

    //The code here will provide the instructions and ask the user for the integers

    public static int getFirstInteger (Scanner sc) {
        System.out.println("Welcome to the Java Calculator!");
        System.out.println("The calculator will ask for two integers and it will perform addition, subtraction, " +
                "multiplication, division, and modulo. ");
        System.out.print("Please enter the first integer: ");
        return sc.nextInt();
    }

    public static int getSecondInteger (Scanner sc) {
        System.out.print("Please enter the second integer: ");
        return sc.nextInt();
    }

    //These are the methods to calculate the math

    public static int add(int firstInteger, int secondInteger) {
        return firstInteger + secondInteger;
    }

    public static int sub(int firstInteger, int secondInteger) {
        return firstInteger + (- secondInteger);
    }

    public static int mult(int firstInteger, int secondInteger) {
        return firstInteger * secondInteger;
    }

    public static double div(double firstInteger, int secondInteger) {
        return firstInteger/secondInteger;
    }

    public static int mod(int firstInteger, int secondInteger) {
        return firstInteger % secondInteger;
    }

}
