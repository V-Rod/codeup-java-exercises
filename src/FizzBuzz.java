/**
 * Created by V-Rod on 1/4/17.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        int count = 1;
        while (count < 100) {
            //System.out.println("count is " + count);
            count++;
            if (count % 3 == 0 && count % 5 == 0) {
                System.out.println("FizzBuzz!");
            } else if (count % 5 == 0) {
                System.out.println("Buzz!");
            } else if (count % 3 == 0) {
                System.out.println("Fizz!");
            } else {
                System.out.println(count);
            }
        }
    }
}
