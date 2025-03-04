import java.util.Scanner;

public class QuotientAndRemainder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two integers (dividend and divisor):");
        int number = scanner.nextInt();
        int divisor = scanner.nextInt();
        
        int[] result = findRemainderAndQuotient(number, divisor);
        System.out.printf("Quotient: %d, Remainder: %d%n", result[0], result[1]);

        scanner.close();
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }
}