public class PaperProperties { // Constants
    public static final double INCH_TO_MM = 25.4;
    public static final double WIDTH_INCHES = 8.5;
    public static final double HEIGHT_INCHES = 11.0;
    public static void main(String[] args) {
        // Convert width and height from inches to millimeters
        double widthMM = WIDTH_INCHES * INCH_TO_MM;
        double heightMM = HEIGHT_INCHES * INCH_TO_MM;
        // Calculate perimeter
        double perimeterMM = 2 * (widthMM + heightMM);
        // Calculate diagonal length using Pythagorean theorem
        double diagonalLengthMM = Math.sqrt(Math.pow(widthMM, 2) + Math.pow(heightMM, 2));
        // Display the properties
        System.out.println("Properties of a letter-size sheet of paper:");
        System.out.println("Width: " + widthMM + " mm");
        System.out.println("Height: " + heightMM + " mm");
        System.out.println("Perimeter: " + perimeterMM + " mm");
        System.out.println("Diagonal length: " + diagonalLengthMM + " mm");
    }
}

