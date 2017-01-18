import java.util.*;
/**
 * Created by V-Rod on 1/17/17.
 */
public class MovieApp {
    public static void main(String[] args) {
        String proceed;
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);
        String userValidator;

        // Create the ArrayList to store the Movie class object
        ArrayList<Movie> movieList = new ArrayList<>();

        // Assemble the arrayList of movieObjects
        for (int i = 1; i <= 100; i++) {
            movieList.add(MovieIO.getMovie(i));
        }

        // output the titles of all movies
//        for (int i = 0; i < movieList.size(); i++) {
//            System.out.println(movieList.get(i).getTitle() + " " + movieList.get(i).getCategory());
//        }

        // enhanced for-loop to output the titles and categories of all movies in MovieIO
//        for (Movie movie : movieList) {
//            System.out.println(movie.getTitle() + " " + movie.getCategory());
//        }

        // Created arrayList for every category
        ArrayList<Movie> animated = new ArrayList<>();
        ArrayList<Movie> drama = new ArrayList<>();
        ArrayList<Movie> comedy = new ArrayList<>();
        ArrayList<Movie> musical = new ArrayList<>();
        ArrayList<Movie> horror = new ArrayList<>();
        ArrayList<Movie> scifi = new ArrayList<>();

        // Iterating over movieList to populate all the category arrayLists
        for (Movie movie : movieList) {
            if (movie.getCategory().equalsIgnoreCase("animated")){
                animated.add(movie);
            } else if (movie.getCategory().equalsIgnoreCase("drama")) {
                drama.add(movie);
            } else if (movie.getCategory().equalsIgnoreCase("comedy")){
                comedy.add(movie);
            } else if (movie.getCategory().equalsIgnoreCase("musical")) {
                musical.add(movie);
            } else if (movie.getCategory().equalsIgnoreCase("horror")) {
                horror.add(movie);
            } else if (movie.getCategory().equalsIgnoreCase("scifi")) {
                scifi.add(movie);
            }

        }
        // Welcome the user to the application
        System.out.println("Welcome to MovieBuzz!");
        System.out.println();
        System.out.println("There are 100 movie in the list.");
        System.out.println("What category are you interested in?");
        System.out.println("Categories include: animated, drama, comedy, horror, musical and scifi. ");
        System.out.println();

        do {
            /* Ask the user to choose a category */
            userValidator = validator.getRequiredString ("Please enter a category name.");

            switch (userValidator) {
                case "animated":
                    System.out.println(animated);
                    break;
                case "drama":
                    System.out.println(drama);
                    break;
                case "horror":
                    System.out.println(horror);
                    break;
                case "scifi":
                    System.out.println(scifi);
                    break;
                case "comedy":
                    System.out.println(comedy);
                    break;
                case "musical":
                    System.out.println(musical);
                    break;
            }
            //scan.nextLine();
            System.out.println();
            System.out.println("Would you like to search for other movies?");
            proceed = validator.getRequiredString("Please type YES or NO and hit the ENTER button. ");
            System.out.println();
        } while (proceed.equalsIgnoreCase("yes") || proceed.equalsIgnoreCase("y"));

        System.out.println("Goodbye! Thank you for using MovieBuzz brought to you by Codeup!");
    }
}
