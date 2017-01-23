package AlligatorsAndSheep;

/**
 * Created by V-Rod on 1/20/17.
 */
public class CountUtil {

    public static void count(Countable c, int maxCount) {

        for (int i = 0; i < maxCount; i++) {

            c.incrementCount();
            c.getCount();

            System.out.println(c.getCountString());

        }
        c.resetCount();

    }


}
