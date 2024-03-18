import java.util.Scanner;

public class LengthConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a measurement in meters
        System.out.print("Enter a measurement in meters: ");
        double meters = scanner.nextDouble();

        // Convert meters to miles
        double miles = meters * 0.000621371;

        // Convert meters to feet
        double feet = meters * 3.28084;

        // Convert meters to inches
        double inches = meters * 39.3701;

        // Display the results
        System.out.println("Conversion results:");
        System.out.println("Miles: " + miles);
        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);

        scanner.close();
    }
}

