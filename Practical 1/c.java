// Write a Java program to print the area and perimeter of a circle.

import java.util.Scanner;

public class c {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        final double pi = 3.14;

        System.out.print("Enter Radius of Circle: ");
        double radius = s.nextDouble();

        System.out.print("\n\nPerimeter of Circle is " + (2 * pi * radius));
        System.out.print("\nArea of Circle is " + (pi * radius * radius));

        s.close();
    }
}
