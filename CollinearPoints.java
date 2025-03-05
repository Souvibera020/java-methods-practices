import java.util.Scanner;

public class CollinearPoints {

    // Method to check collinearity using slope formula
    public static boolean areCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        double slopeAB = (double)(y2 - y1) / (x2 - x1);
        double slopeBC = (double)(y3 - y2) / (x3 - x2);
        double slopeAC = (double)(y3 - y1) / (x3 - x1);
        
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to check collinearity using area of triangle formula
    public static boolean areCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Area of triangle formula
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for three points
        System.out.println("Enter coordinates for Point A (x1, y1):");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        
        System.out.println("Enter coordinates for Point B (x2, y2):");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        
        System.out.println("Enter coordinates for Point C (x3, y3):");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        
        // Check collinearity using slope
        boolean collinearBySlope = areCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        // Check collinearity using area
        boolean collinearByArea = areCollinearUsingArea(x1, y1, x2, y2, x3, y3);

        // Result Output
        if (collinearBySlope && collinearByArea) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are not collinear.");
        }
    }
}