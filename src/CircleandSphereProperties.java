import java.util.Scanner;

public class CircleAndSphereProperties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the radius
        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();

        // Calculate circle properties
        double circleArea = Math.PI * radius * radius;
        double circleCircumference = 2 * Math.PI * radius;

        // Calculate sphere properties
        double sphereVolume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        double sphereSurfaceArea = 4 * Math.PI * radius * radius;

        // Display results
        System.out.println("Circle Properties:");
        System.out.println("Area: " + circleArea);
        System.out.println("Circumference: " + circleCircumference);
        System.out.println("Sphere Properties:");
        System.out.println("Volume: " + sphereVolume);
        System.out.println("Surface Area: " + sphereSurfaceArea);

        scanner.close();
    }
}

