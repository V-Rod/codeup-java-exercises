/**
 * Created by V-Rod on 1/3/17.
 */
public class TypeDemo {
    //create variables of every primitive type and print them to the console
    //try to assign a character to a variable that has been declared as an int
    //try to define a variable with the name class
    //initialize a variable, but do not assign it a value, then try and print it to the console

    public static void main(String[] args) {
        byte myByte = Byte.MAX_VALUE;
        System.out.println(myByte);

        short myShort = -32768;
        System.out.println(myShort);

        int myInt = -2147483648;
        System.out.println(myInt);

        long myLong = 9223372036854775806L;
        System.out.println(myLong);

        float myFloat = 10.4f;
        System.out.println(myFloat);

        double myDouble = 3.14159265;
        System.out.println(myDouble);

        char myChar = 'C';
        System.out.println(myChar);

        boolean myBoolean = true;
        System.out.println(myBoolean);


    }
}
