import java.util.Scanner;

public class Quadratic {
    
    // Method to find the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c; // Calculate the discriminant

        if (delta > 0) {
            // Two distinct roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            // One root
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            // No real roots
            return new double[0]; // Return an empty array
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for coefficients a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Finding the roots
        double[] roots = findRoots(a, b, c);

        // Displaying the results
        if (roots.length == 0) {
            System.out.println("No real roots exist.");
        } else {
            System.out.println("Roots of the equation:");
            for (double root : roots) {
                System.out.printf("%.2f%n", root);
            }
        }

        scanner.close();
    }
}