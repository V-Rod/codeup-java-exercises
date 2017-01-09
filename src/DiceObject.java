/**
 * Created by V-Rod on 1/9/17.
 */
public class DiceObject {

    public int numberOfSides;
    public int currentValue;

    // construct a die
    public DiceObject(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }


    // roll the die

    public int rollDice() {
        // generate a random number between 1 and this die's numberOfSides
        currentValue = (int) Math.ceil(Math.random() * numberOfSides);

        // return the random roll
        return currentValue;
    }
}