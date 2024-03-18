import java.util.Scanner;

public class NumberOperations2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for two integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Calculate the sum
        int sum = num1 + num2;

        // Calculate the difference
        int difference = num1 - num2;

        // Calculate the product
        int product = num1 * num2;

        // Calculate the average
        double average = (double) (num1 + num2) / 2;

        // Calculate the distance
        int distance = Math.abs(num1 - num2);

        // Find the maximum
        int maximum = Math.max(num1, num2);

        // Find the minimum
        int minimum = Math.min(num1, num2);

        // Print the results with proper alignment
        System.out.printf("Sum:       %5d\n", sum);
        System.out.printf("Difference:%5d\n", difference);
        System.out.printf("Product:   %5d\n", product);
        System.out.printf("Average:   %8.2f\n", average);
        System.out.printf("Distance:  %5d\n", distance);
        System.out.printf("Maximum:   %5d\n", maximum);
        System.out.printf("Minimum:   %5d\n", minimum);

        scanner.close();
    }
}

