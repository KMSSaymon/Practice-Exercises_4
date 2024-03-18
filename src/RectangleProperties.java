import java.util.Scanner;

public class RectangleProperties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the lengths of the rectangle's sides
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate area and perimeter of the rectangle
        double area = length * width;
        double perimeter = 2 * (length + width);

        // Calculate length of the diagonal using Pythagorean theorem
        double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));

        // Display results
        System.out.println("Rectangle Properties:");
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Length of the diagonal: " + diagonal);

        scanner.close();
    }
}

