/**
 * Created by V-Rod on 1/18/17.
 */
public abstract class Player {

    protected String name;
    protected String response;

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

    //abstract method that allows an inheriting class
    //to generate and return a Roshambo value

    public abstract Roshambo generateRoshambo();
}
