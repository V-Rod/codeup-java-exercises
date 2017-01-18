/**
 * Created by V-Rod on 1/17/17.
 */
public class Movie {
    @Override
    public String toString() {
        return getTitle();
    }

    private String title;
    private String category;

    public String getTitle() {

        return title;
    }

    public String getCategory() {
        return category;
    }

    public Movie(String title, String category) {
        this.title = title;
        this.category = category;
    }



}
