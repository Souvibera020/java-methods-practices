import java.util.Scanner;

public class RoundsInTriangularPark {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lengths of the three sides of the triangle (in meters):");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        
        int rounds = calculateRoundsFor5Km(side1, side2, side3);
        System.out.printf("The athlete must complete %d rounds to run 5 km.%n", rounds);

        scanner.close();
    }

    public static int calculateRoundsFor5Km(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distance = 5000; // 5 km in meters
        return (int) Math.ceil(distance / perimeter);
    }
}