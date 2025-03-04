import java.util.Scanner;

public class HandshakesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the number of students as input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        
        // Calculate the maximum number of handshakes using the formula
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        
        // Display the result
        System.out.println("Maximum number of possible handshakes: " + maxHandshakes);
    }
}
