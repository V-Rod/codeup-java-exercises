import java.util.Scanner;
import java.lang.Math;

/**
 * Created by V-Rod on 1/17/17.
 */
public class Circle {

    Scanner scan = new Scanner(System.in);
    private double radius;
    private double circumference;
    private double area;
    private String formattedCircumference;
    private String formattedArea;
    private String formatNumber;
    private int objectCount;

    // number of circles created
    public static int circlesCreated;

    public Circle(double radius) {
        this.radius = radius;
        circlesCreated++;
    }

    public double getRadius(String prompt, Scanner scan) {
        return radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;

    }

    public String getFormattedCircumference() {
        return getFormatNumber(getCircumference());

    }

    public double getArea() {
        return Math.PI * (radius * radius);

    }

    public String getFormattedArea() {
        return getFormatNumber(getArea());

    }

    public String getFormatNumber(double x) {
        return  String.format("%.2f", x);

    }

    public int getObjectCount() {
        return objectCount;
    }



}
