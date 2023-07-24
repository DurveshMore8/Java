// Write a Java program to print the area and perimeter of a circle.

import java.util.Scanner;

public class c1 {
    public static void main(String args[]) {
        // Defining Scanner
        Scanner s = new Scanner(System.in);
        final double pi = 3.14;

        // Taking double value as radius from user
        System.out.print("Enter Radius of Circle: ");
        double radius = s.nextDouble();

        // Calculating Perimeter and Area using formulas
        System.out.print("\n\nPerimeter of Circle is " + (2 * pi * radius));
        System.out.print("\nArea of Circle is " + (pi * radius * radius));

        s.close();
    }
}
