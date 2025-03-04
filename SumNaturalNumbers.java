import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        // Validate input
        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
            return;
        }
        
        // Compute sum using recursion
        int sumRecursive = sumUsingRecursion(n);
        
        // Compute sum using formula
        int sumFormula = sumUsingFormula(n);
        
        // Display results
        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using formula: " + sumFormula);
        
        // Verify results
        if (sumRecursive == sumFormula) {
            System.out.println("Both computations match. The result is correct.");
        } else {
            System.out.println("Mismatch in results. Check for errors.");
        }
    }
    
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }
    
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
}
