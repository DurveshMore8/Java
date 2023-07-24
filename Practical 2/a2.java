// Write a Java program to add two binary numbers.

import java.util.Scanner;

public class a2 {
  // Function to reverse a String
  static String reverseString(String string) {
    String reverseString = "";
    char c;
    for (int i = string.length() - 1; i >= 0; i--) {
      c = string.charAt(i);
      reverseString += c;
    }
    return reverseString;
  }

  public static void main(String args[]) {
    String binary1, binary2;
    Scanner sc = new Scanner(System.in);

    // Taking binary numbers as string from user
    System.out.print("Enter 1st binary number: ");
    binary1 = sc.nextLine();
    System.out.print("Enter 2nd binary number: ");
    binary2 = sc.nextLine();
    sc.close();

    // Getting lengths of both Strings
    int b1 = binary1.length() - 1;
    int b2 = binary2.length() - 1;

    // Reverse both binaries to add
    String reversedBinary1 = reverseString(binary1);
    String reversedBinary2 = reverseString(binary2);
    String result = "";
    int carry = 0;

    // The loop will run until both the strings aren't completely accessed
    while (b1 >= 0 || b2 > 0) {
      // Assigning the carry of previous numbers to sum
      int sum = carry;

      // Adding numbers to sum if they exist
      if (b1 >= 0) {
        sum += reversedBinary1.charAt(b1) - '0';
      }
      if (b2 >= 0) {
        sum += reversedBinary2.charAt(b2) - '0';
      }

      // If sum is 0 or 1 it will be appended
      if (sum == 0 || sum == 1) {
        result += sum;
        carry = 0;
      }

      // if sum is 2 it means the answer is 0 and we have to carry 1
      else if (sum == 2) {
        result += "0";
        carry = 1;
      }

      // if sum is 2 it means the answer is 1 and we have to carry
      else {
        result += "1";
        carry = 1;
      }

      b1--;
      b2--;
    }

    // If a carry is remaining it will be appended
    if (carry == 1) {
      result += "1";
    }

    // Reversing the result string and printing
    System.out.printf("%s + %s = %s", binary1, binary2, reverseString(result));
  }
}