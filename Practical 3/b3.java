// Implement a Java function that calculates the sum of digits for a given char array consisting of the digits '0' to '9'.
// The function should return the digit sum as a long value.

public class b3 {
  // Declared a function named sumProvider with return type int
  static int sumProvider(char[] c) {
    // This variable will container the sum
    int sum = 0;

    // This logic converts char to int and adds it to sum
    for (int i = 0; i < c.length; i++) {
      sum += (c[i] - '0');
    }

    // return the sum
    return sum;
  }

  public static void main(String args[]) {
    char[] charArray = { '1', '5', '2', '8', '9', '3', '4', '6' };
    int sumOfChars = sumProvider(charArray);
    System.out.printf("Sum of Characters is %d", sumOfChars);
  }
}