import java.util.Scanner;
public class Powers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the number from the user
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        // Calculate square, cube, and fourth power
        double square = number * number;
        double cube = square * number;
        double fourthPower = Math.pow(number, 4);
        // Display results
        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
        System.out.println("Fourth power: " + fourthPower);
        scanner.close();
    }
}

