// Write a Java program to display the following pattern.
// ****
// ***
// **
// *

class b {
    public static void main(String args[]) {
        for (int i = 0; i < 4; i++) {
            for (int j = 4 - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
