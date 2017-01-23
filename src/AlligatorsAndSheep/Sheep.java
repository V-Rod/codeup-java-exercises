package AlligatorsAndSheep;

/**
 * Created by V-Rod on 1/20/17.
 */
public class Sheep implements Countable, Cloneable  {

    int countSheep = 0;
    String sheepName;

    @Override
    public void incrementCount() {
        countSheep++;
    }

    @Override
    public void resetCount() {
        countSheep = 0;
    }

    @Override
    public int getCount() {
        return countSheep;
    }

    @Override
    public String getCountString() {
        return countSheep + " " + getSheepName(sheepName);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getSheepName(String sheepName) {
        return sheepName;
    }

    public void setSheepName(String sheep) {
        sheepName = sheep;
    }




}
