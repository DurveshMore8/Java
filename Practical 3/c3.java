// Find the smallest and largest element from the array.

public class c3 {
  public static void main(String args[]) {
    // Declared int array and assigned values to it.
    int[] numbers = { 12, 23, 105, 56, 8, 87, 94, 45 };
    int smallest, largest;

    // Assigned first value of array to both variables.
    smallest = largest = numbers[0];

    // Getting each number of array and comparing them with smallest and largest
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] < smallest) {
        smallest = numbers[i];
      }
      if (numbers[i] > largest) {
        largest = numbers[i];
      }
    }

    // Printing the smallest and largest values.
    System.out.printf("Smallest number is %d", smallest);
    System.out.printf("\nLargest number is %d", largest);
  }
}
