/**
 * Created by V-Rod on 1/18/17.
 */
public class HumanPlayer extends Player {

    // this is the player that gets the input from the human playing the game


    public HumanPlayer(){
        super();
    }

    @Override
    public Roshambo generateRoshambo()
    {
        if (response.compareTo("R") == 0 || response.compareTo("r") == 0) return Roshambo.ROCK;
        if (response.compareTo("P") == 0 || response.compareTo("p") == 0) return Roshambo.PAPER;
        return Roshambo.SCISSORS;
    }

}
