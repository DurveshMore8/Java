// Write a program that takes a number as input and prints its multiplication table upto 10.

import java.util.Scanner;

class a1 {
    public static void main(String args[]) {
        // Defining Scanner.
        Scanner s = new Scanner(System.in);

        // Taking Integer value from user.
        System.out.print("Enter Number: ");
        int no = s.nextInt();
        s.close();

        // Login to Print table
        System.out.println("\nTable of " + no + " is:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(no + " * " + i + " = " + no * i);
        }
    }
}