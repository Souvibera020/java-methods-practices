import java.util.Random;

public class RandomNumberStats {

    public static void main(String[] args) {
        int size = 5; // We want to generate 5 random numbers
        int[] randomNumbers = generate4DigitRandomArray(size);
        
        double[] stats = findAverageMinMax(randomNumbers);
        
        System.out.println("Generated Random Numbers: ");
        for (int number : randomNumbers) {
            System.out.println(number);
        }
        
        System.out.printf("Average: %.2f%n", stats[0]);
        System.out.println("Minimum: " + (int) stats[1]);
        System.out.println("Maximum: " + (int) stats[2]);
    }

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        Random random = new Random();
        int[] randomNumbers = new int[size];
        
        for (int i = 0; i < size; i++) {
            // Generate a random number between 1000 and 9999
            randomNumbers[i] = 1000 + random.nextInt(9000);
        }
        
        return randomNumbers;
    }

    // Method to find average, min, and max value of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number : numbers) {
            sum += number;
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }
}