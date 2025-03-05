import java.util.ArrayList;

public class AdvancedNumberChecker {
    
    // Method to find factors of a number
    public static int[] findFactors(int num) {
        ArrayList<Integer> factorsList = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factorsList.add(i);
            }
        }
        return factorsList.stream().mapToInt(i -> i).toArray();
    }
    
    // Method to find the greatest factor
    public static int greatestFactor(int num) {
        int[] factors = findFactors(num);
        return factors[factors.length - 2]; // Last factor excluding the number itself
    }
    
    // Method to find the sum of factors
    public static int sumOfFactors(int num) {
        int sum = 0;
        for (int factor : findFactors(num)) {
            sum += factor;
        }
        return sum;
    }
    
    // Method to find the product of factors
    public static long productOfFactors(int num) {
        long product = 1;
        for (int factor : findFactors(num)) {
            product *= factor;
        }
        return product;
    }
    
    // Method to find the product of cubes of factors
    public static double productOfCubesOfFactors(int num) {
        double product = 1;
        for (int factor : findFactors(num)) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
    
    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int factor : findFactors(num)) {
            if (factor != num) {
                sum += factor;
            }
        }
        return sum == num;
    }
    
    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int num) {
        int sum = 0;
        for (int factor : findFactors(num)) {
            if (factor != num) {
                sum += factor;
            }
        }
        return sum > num;
    }
    
    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int num) {
        int sum = 0;
        for (int factor : findFactors(num)) {
            if (factor != num) {
                sum += factor;
            }
        }
        return sum < num;
    }
    
    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int num) {
        int temp = num, sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }
    
    // Helper method to calculate factorial of a number
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
    public static void main(String[] args) {
        int num = 28;
        System.out.println("Factors of " + num + ": " + java.util.Arrays.toString(findFactors(num)));
        System.out.println("Greatest factor: " + greatestFactor(num));
        System.out.println("Sum of factors: " + sumOfFactors(num));
        System.out.println("Product of factors: " + productOfFactors(num));
        System.out.println("Product of cubes of factors: " + productOfCubesOfFactors(num));
        System.out.println("Is perfect number? " + isPerfectNumber(num));
        System.out.println("Is abundant number? " + isAbundantNumber(num));
        System.out.println("Is deficient number? " + isDeficientNumber(num));
        System.out.println("Is strong number? " + isStrongNumber(num));
    }
}
