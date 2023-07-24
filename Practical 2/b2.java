// Write a Java program to convert a decimal number to binary number and vice versa.

import java.util.Scanner;

public class b2 {
  static int binaryToDecimal(String binary) {
    int decimal = 0;

    for (int i = 0; i < binary.length(); i++) {
      if (binary.charAt(i) == '1') {
        decimal += Math.pow(2, binary.length() - i - 1);
      }
    }

    return decimal;
  }

  static String decimalToBinary(int decimal) {
    String binary = "";

    while (decimal > 0) {
      binary += decimal % 2;
      decimal /= 2;
    }

    return binary;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    // Convert Binary to Decimal
    System.out.print("Enter Binary Number: ");
    String binaryString = sc.nextLine();
    int btod = binaryToDecimal(binaryString);
    System.out.printf("Decimal of %s is %d", binaryString, btod);

    // Convert Decimal to Binary
    System.out.print("\n\nEnter Decimal Number: ");
    int decimalInteger = sc.nextInt();
    String dtob = decimalToBinary(decimalInteger);
    System.out.printf("Binary of %d is %s", decimalInteger, dtob);
    sc.close();
  }
}
