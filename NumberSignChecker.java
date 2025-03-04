import java.util.Scanner;

public class NumberSignChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check if it is positive, negative, or zero:");
        int number = scanner.nextInt();
        
        int result = checkNumber(number);
        System.out.printf("The number is: %d (1 for positive, -1 for negative, 0 for zero)%n", result);

        scanner.close();
    }

    public static int checkNumber(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}