import java.util.Scanner;

public class NumberOperations {
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

        // Print the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
        System.out.println("Distance: " + distance);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);

        scanner.close();
    }
}
