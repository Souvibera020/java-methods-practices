import java.util.Scanner;

public class TrigonometricFunctionsCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an angle in degrees:");
        double angle = scanner.nextDouble();
        
        double[] results = calculateTrigonometricFunctions(angle);
        System.out.printf("Sine: %.4f, Cosine: %.4f, Tangent: %.4f%n", results[0], results[1], results[2]);

        scanner.close();
    }

    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);
        
        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        
        return new double[]{sine, cosine, tangent};
    }
}