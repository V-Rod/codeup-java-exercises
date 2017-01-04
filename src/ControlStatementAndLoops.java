/**
 * Created by V-Rod on 1/4/17.
 */
public class ControlStatementAndLoops {
    public static void main(String[] args) {

        //while loop
        int i = 5;
        while (i <=15) {
            System.out.println("i is " + i);
            i++;
        }

        //do while loop
        int count = 0;
        do {
            System.out.println("count is " + count);
            count +=2;

        } while (count <=100);

        int countBackwards = 100;
        do {
            System.out.println("reverse count is " + countBackwards);
            countBackwards -= 5;
        } while (countBackwards >= -10);

        int countSquared = 2;
        do {
            System.out.println("squared count is " + countSquared);
            countSquared = (int)Math.pow(countSquared, 2);
        } while (countSquared <= 1000000);

        //refactoring previous exercises with a for loop

        for (int forInt = 5; forInt <= 15; forInt++) {
            System.out.println("forInt is " + forInt);
        }

        for (int forCount = 0; forCount <=100; forCount+=2){
            System.out.println("forCount is " + forCount);
        }

        for (int forCountBackwards = 100; forCountBackwards >= -10; forCountBackwards -= 5) {
            System.out.println("forCountBackwards is " + forCountBackwards);
        }

        for (double forCountSquared = 2; forCountSquared <= 1000000; forCountSquared = Math.pow(forCountSquared, 2)){
            System.out.println("forCountSquared is " + forCountSquared);
        }

        System.out.println("Thank you for using this program.");



    }
}
