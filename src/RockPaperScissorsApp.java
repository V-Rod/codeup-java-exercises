import java.util.Scanner;

/**
 * Created by V-Rod on 1/18/17.
 */
public class RockPaperScissorsApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        String name;
        String userRoshambo;
        String compRoshambo;
        String playerChoice;
        char player;
        Player cpuPlayer = null;

        // Welcome the user to the application
        System.out.println("Welcome to ");
        System.out.println("                     _                                             _                        \n" +
                "                    | |                                           (_)                       \n" +
                "      _ __ ___   ___| | __  _ __   __ _ _ __   ___ _ __   ___  ___ _ ___ ___  ___  _ __ ___ \n" +
                "     | '__/ _ \\ / __| |/ / | '_ \\ / _` | '_ \\ / _ | '__| / __|/ __| / __/ __|/ _ \\| '__/ __|\n" +
                "     | | | (_) | (__|   <  | |_) | (_| | |_) |  __| |    \\__ | (__| \\__ \\__ | (_) | |  \\__ \\\n" +
                "     |_|  \\___/ \\___|_|\\_\\ | .__/ \\__,_| .__/ \\___|_|    |___/\\___|_|___|___/\\___/|_|  |___/\n" +
                "                           | |         | |                                                  \n" +
                "                           |_|         |_|                                                  \n");
        System.out.println("You will be playing against one of two computer generated players: Joseph and Herbert.");
        System.out.println();

        // Create the Opponent objects and HumanPlayer Object
        RockPlayer h = new RockPlayer();
        ComputerPlayer j = new ComputerPlayer();
        HumanPlayer humanPlayer = new HumanPlayer();

        // Input name of human player and ask who does the human player want to play against
        name = Validator.getUserString("Enter your name: ");
        playerChoice = Validator.getUserString("Would you like to play against Herbert or Joseph.  Please enter " +
                "H for Herbert or J for Joseph: ");

        // setting behavior for human player input for opponent
        player = playerChoice.charAt(0);
        if (player == 'J' || player == 'j') {
            cpuPlayer = j;
        } else if (player == 'H' || player == 'h') {
            cpuPlayer = h;
        }

        while (choice.compareTo("y") == 0) {

            System.out.print("Rock, paper, or scissors (R/P/S): ");
            userRoshambo = sc.next();
            humanPlayer.setName(name);
            humanPlayer.setResponse(userRoshambo);

            //set Rock for r|R ,Paper for p|P, Scissors for s|S for human player

            if (userRoshambo.charAt(0) == 'r' || userRoshambo.charAt(0) == 'R') {
                userRoshambo = "Rock";
            } else if (userRoshambo.charAt(0) == 'p' || userRoshambo.charAt(0) == 'P') {
                userRoshambo = "Paper";
            } else if (userRoshambo.charAt(0) == 's' || userRoshambo.charAt(0) == 'S') {
                userRoshambo = "Scissors";
            }
            System.out.println(name + " : " + userRoshambo);

            //main logic generate random number for computer player
            compRoshambo = cpuPlayer.generateRoshambo().toString(); //generate opponent's roshambo
            System.out.println(cpuPlayer.getName() + " : " + compRoshambo);

            //match generated random number to roshambo entered by user for all cases
            if (Character.toUpperCase(userRoshambo.charAt(0)) == compRoshambo.charAt(0)) {
                System.out.println("Draw!");
            } else if (userRoshambo.equals("Paper") && compRoshambo.equals("Rock")) {
                System.out.println(humanPlayer.getName() + " Wins");
                humanPlayer.win();
                cpuPlayer.lose();
            } else if (compRoshambo.equals("Paper") && userRoshambo.equals("Rock")) {
                System.out.println(cpuPlayer.getName() + " Wins");
                cpuPlayer.win();
                humanPlayer.lose();
            } else if (userRoshambo.equals("Paper") && compRoshambo.equals("Scissors")) {
                System.out.println(cpuPlayer.getName() + " Wins!");
                cpuPlayer.win();
                humanPlayer.lose();
            } else if (compRoshambo.equals("Paper") && userRoshambo.equals("Scissors")) {
                System.out.println(humanPlayer.getName() + " Wins!");
                humanPlayer.win();
                cpuPlayer.lose();
            } else if (userRoshambo.equals("Scissors") && compRoshambo.equals("Rock")) {
                System.out.println(cpuPlayer.getName() + " Wins");
                cpuPlayer.win();
                humanPlayer.lose();
            } else if (compRoshambo.equals("Scissors") && userRoshambo.equals("Rock")) {
                System.out.println(humanPlayer.getName() + " Wins");
                humanPlayer.win();
                cpuPlayer.lose();
            }
            // see if the user wants to continue
            choice = Validator.getString("Play again?(y/n): ");
        }
        System.out.println();
        System.out.println("Thank you for playing!");
        System.out.println(humanPlayer.summary());
        System.out.println(cpuPlayer.summary());
    }
}
