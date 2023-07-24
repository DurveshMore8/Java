// Write a Java program to reverse a string.

import java.util.Scanner;

public class c2 {
  public static void main(String args[]) {
    // Taking string as input from user.
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a String: ");
    String string = sc.nextLine();
    sc.close();

    // Get last character of string and assign it to new string
    String reversedString = "";
    for (int i = string.length() - 1; i >= 0; i--) {
      reversedString += string.charAt(i);
    }

    System.out.printf("Reversed String: %s", reversedString);
  }
}
