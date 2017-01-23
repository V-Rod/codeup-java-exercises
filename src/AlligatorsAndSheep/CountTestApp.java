package AlligatorsAndSheep;
import static AlligatorsAndSheep.CountUtil.count;

/**
 * Created by V-Rod on 1/20/17.
 */
public class CountTestApp {
    public static void main(String[] args) {

        // Process for Alligator
        System.out.println("Counting Alligators... ");
        System.out.println();

        // create the alligator object
        Countable alligator = new Alligator();
        count(alligator, 3);
        System.out.println();

        // Process for Sheep
        System.out.println("Counting Sheep... ");
        System.out.println();

        // create the sheep object
        Countable sheep = new Sheep();
        Sheep sheep1 = new Sheep();

        // reset the count
        sheep1.resetCount();

        // set the name for sheep1 and count the sheep
        sheep1.setSheepName("Blackie");
        count(sheep1, 2);
        System.out.println();

        // create a sheep2 object,  we clone sheep1, reset the count for sheep2 and name clone sheep2
        Sheep sheep2 = new Sheep();
        try {
            sheep2 = (Sheep) sheep1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        sheep2.resetCount();
        sheep2.setSheepName("Dolly");

        // count the cloned sheep 3 times
        count(sheep2, 3);
        System.out.println();

        // reset the count for the first sheep and count the sheep 1 time
        sheep1.resetCount();
        count(sheep1, 1);

    }
}
