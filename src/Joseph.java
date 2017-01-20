import java.util.Random;

/**
 * Created by V-Rod on 1/18/17.
 */
public class Joseph extends Player {

    // this player randomly select rock, paper, or scissors
    public Joseph() {
        name = "Joseph";
    }

    @Override
    public Roshambo generateRoshambo() {
        Random random = new Random();
        int choice = random.nextInt(3);
        if (choice == 0) {
            return Roshambo.ROCK;
        } else if (choice == 1) {
            return Roshambo.PAPER;
        } else {
            return Roshambo.SCISSORS;
        }
    }
}
