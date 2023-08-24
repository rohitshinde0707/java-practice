package exercise_15;

import java.util.Scanner;
// Java Program For Calculate Product of Two Binary Number ===========
public class Exercise15 {
    public static void main(String[] args) {
        // Declare variables
        long binary1, binary2, multiply = 0;
        int digit, factor = 1;

        // Create a Scanner object to read input
        Scanner in = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter The First Binary Number: ");
        binary1 = in.nextLong();
        System.out.println("Enter The Second Binary Number: ");
        binary2 = in.nextLong();

        // Perform binary multiplication
        while (binary2 != 0) {
            digit = (int)(binary2 % 10);

            if (digit == 1) {
                // Update binary1 and calculate partial product
                binary1 = binary1 * factor;
                multiply = binaryproduct((int) binary1, (int) multiply);
            } else {
                // Only update binary1
                binary1 = binary1 * factor;
            }

            // Move to the next digit of binary2
            binary2 = binary2 / 10;
            factor = 10;
        }

        // Display the product of two binary numbers
        System.out.println("Product Of Two Binary Numbers: " + multiply + "\n");
    }

    // Function to perform binary addition
    static int binaryproduct(int binary1, int binary2) {
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        int binary_prod_result = 0;

        // Perform binary addition
        while (binary1 != 0 || binary2 != 0) {
            // Calculate sum of corresponding digits and remainder
            sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
            remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }

        // If there's a remainder, add it to the result
        if (remainder != 0) {
            sum[i++] = remainder;
        }
        --i;

        // Convert the binary sum array to a single integer
        while (i >= 0) {
            binary_prod_result = binary_prod_result * 10 + sum[i--];
        }

        // Return the binary product result
        return binary_prod_result;
    }
}
