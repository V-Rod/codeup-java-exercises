import java.util.Scanner;

/**
 * Created by V-Rod on 1/5/17.
 */
public class MethodsArithmetic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 12;
        int b = 5;

        int addResult = add(a, b);
        System.out.println(addResult);

        int subResult = sub(a, b);
        System.out.println(subResult);

        int mulResult = mul(a, b);
        System.out.println(mulResult);

        int divResult = div(a, b);
        System.out.println(divResult);

        int modResult = mod(a, b);
        System.out.println(modResult);


    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a/b;
    }

    public static int mod(int a, int b) {
        return a % b;
    }

}
