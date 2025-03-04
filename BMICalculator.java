import java.util.Scanner;

public class BMICalculator {
    
    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        return weight / ((height / 100) * (height / 100)); // height converted to meters
    }

    // Method to determine BMI status
    public static String determineBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] membersData = new double[10][3]; // 10 members, weight, height, BMI

        // Collecting data
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (in kg) for member " + (i + 1) + ": ");
            membersData[i][0] = scanner.nextDouble(); // weight
            System.out.print("Enter height (in cm) for member " + (i + 1) + ": ");
            membersData[i][1] = scanner.nextDouble(); // height
            membersData[i][2] = calculateBMI(membersData[i][0], membersData[i][1]); // calculate BMI
        }

        // Display results
        System.out.println("\nMember Data:");
        System.out.println("Weight (kg), Height (cm), BMI, Status");
        for (int i = 0; i < 10; i++) {
            String status = determineBMIStatus(membersData[i][2]);
            System.out.printf("%.2f, %.2f, %.2f, %s\n", membersData[i][0], membersData[i][1], membersData[i][2], status);
        }
    }
}