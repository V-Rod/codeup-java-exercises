package AlligatorsAndSheep;

/**
 * Created by V-Rod on 1/20/17.
 */

// Alligator class implements the Countable interface
public class Alligator implements Countable {

    // instance variable that stores the count
    int count;

    //use the @Override to override the
    //Countable interface incrementCount()method
    //and increment count with ++
    @Override
    public void incrementCount() {
        count++;
    }

    //
    @Override
    public void resetCount() {
        count = 0;

    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String getCountString() {
        return count + "" + " Alligator";
    }
}
