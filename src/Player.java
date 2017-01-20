/**
 * Created by V-Rod on 1/18/17.
 */
public abstract class Player {

    protected String name;
    protected String response;
    private int winsCounter = 0;
    private int lossCounter = 0;

    public Player() {
        this.name = getName();
        this.response = getResponse();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String summary() {
        return name + " has won " + winsCounter + " times and has lost " + lossCounter + " times.";
    }

    public void lose() {
        lossCounter++;
    }

    public void win() {
        winsCounter++;
    }

    public int getWinsCounter() {
        return winsCounter;
    }

    public void setWinsCounter(int winsCounter) {
        this.winsCounter = winsCounter;
    }

    public int getLossCounter() {
        return lossCounter;
    }

    public void setLossCounter(int lossCounter) {
        this.lossCounter = lossCounter;
    }


    //abstract method that allows an inheriting class
    //to generate and return a Roshambo value

    public abstract Roshambo generateRoshambo();
}
