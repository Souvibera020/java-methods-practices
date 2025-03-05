import java.util.Random;
import java.util.Scanner;

public class StudentScores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Generate random scores
        int[][] scores = generateRandomScores(numStudents);

        // Calculate totals, averages, and percentages
        double[][] results = calculateResults(scores);

        // Display the scorecard
        displayScorecard(results);
        
        scanner.close();
    }

    private static int[][] generateRandomScores(int numStudents) {
        int[][] scores = new int[numStudents][3]; // Array to hold scores for Physics, Chemistry, Math
        Random random = new Random();

        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = random.nextInt(100); // Random scores from 0 to 99
            }
        }
        return scores;
    }

    private static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][5]; // Array to hold total, average, percentage, and scores

        for (int i = 0; i < scores.length; i++) {
            double total = 0;

            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }

            double average = Math.round(total / scores[i].length);
            double percentage = Math.round((total / (scores[i].length * 99)) * 100);

            results[i][0] = total;          // Total
            results[i][1] = average;        // Average
            results[i][2] = percentage;     // Percentage
            results[i][3] = scores[i][0];   // Physics score
            results[i][4] = scores[i][1];   // Chemistry score
            results[i][5] = scores[i][2];   // Math score
        }
        return results;
    }

    private static void displayScorecard(double[][] results) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage");

        for (double[] result : results) {
            System.out.printf("%-10d %-10d %-10d %-10.0f %-10.0f %-10.0f%n", 
                (int) result[3], (int) result[4], (int) result[5], result[0], result[1], result[2]);
        }
    }
}