import java.util.Scanner;

public class SmallestAndLargest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        
        int[] result = findSmallestAndLargest(number1, number2, number3);
        System.out.printf("Smallest: %d, Largest: %d%n", result[0], result[1]);

        scanner.close();
    }

    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(Math.min(number1, number2), number3);
        int largest = Math.max(Math.max(number1, number2), number3);
        return new int[]{smallest, largest};
    }
}