// Write a Java program to count the letters, spaces, numbers and other characters of an input string.

import java.util.Scanner;

class a3 {
  public static void main(String args[]) {
    // Defined Scanner to take value from user.
    Scanner sc = new Scanner(System.in);

    // Input String from user
    System.out.print("Enter a String: ");
    String s = sc.nextLine();
    sc.close();

    // Defined Variables
    int letters, spaces, numbers, others;
    letters = spaces = numbers = others = 0;

    // Loop to access through each letter of string
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
        letters++;
      } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
        numbers++;
      } else if (s.charAt(i) == ' ') {
        spaces++;
      } else {
        others++;
      }
    }

    // Printing all values
    System.out.println("String: " + s);
    System.out.println("Letters: " + letters);
    System.out.println("Numbers: " + numbers);
    System.out.println("Spaces: " + spaces);
    System.out.print("Others: " + others);
  }
}
