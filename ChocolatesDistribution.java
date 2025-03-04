import java.util.Scanner;

public class ChocolatesDistribution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of chocolates and number of children:");
        int numberOfChocolates = scanner.nextInt();
        int numberOfChildren = scanner.nextInt();
        
        int[] result = distributeChocolates(numberOfChocolates, numberOfChildren);
        System.out.printf("Each child gets: %d chocolates, Remaining chocolates: %d%n", result[0], result[1]);

        scanner.close();
    }

    public static int[] distributeChocolates(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        return new int[]{chocolatesPerChild, remainingChocolates};
    }
}