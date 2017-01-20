/**
 * Created by V-Rod on 1/18/17.
 */
public class Herbert extends Player {

    // This player always select Rock when playing rock paper scissors
    public Herbert() {
        name = "Herbert";
    }

    @Override
    public Roshambo generateRoshambo() {
        return Roshambo.ROCK;
    }


}
