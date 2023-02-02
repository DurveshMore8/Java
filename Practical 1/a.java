// Write a program that takes a number as input and prints its multiplication table upto 10.

import java.util.Scanner;

class a {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int no = s.nextInt();

        System.out.println("\nTable of " + no + " is:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(no + " * " + i + " = " + no * i);
        }

        s.close();
    }
}