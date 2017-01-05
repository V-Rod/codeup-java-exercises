import java.util.Scanner;

/**
 * Created by V-Rod on 1/5/17.
 */

/** Ask the user for a word.
 * Iterate over the word to check for vowels.
 * If the word starts with a vowel, then return the word with "way" at the end of it. (ex. Alonso -> alonsoway).
 * If a word starts with a consonant, move all of the consonants that appear before the first vowel to the end of the
 * word, then add “ay” to the end of the word. (ex. Bob -> obbay).
 * Ask the user if they want to keep translating.
 */


public class Methods {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String wordFromUser;

        //Welcome the user to the application
        System.out.println("Welcome to the PigLatin Translator!");
        System.out.println("When prompted, please enter a word and it will be translated.");
        System.out.print("Please enter a word: ");
        wordFromUser = sc.nextLine();

    }

    //checking for vowels
//    public static String findVowel(String word) {
//
//        for (int i = 0; i < word.length(); i +=1) {
//
//        }
//
//
//    }

    //translation method

//    public static String translate(String word) {
//
//
//    }






}
