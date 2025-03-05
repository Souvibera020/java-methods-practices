import java.util.Random;

public class ZaraEmployeeBonus {

    // Method to generate salaries and years of service
    public static int[][] getSalaryAndYears(int numberOfEmployees) {
        Random rand = new Random();
        int[][] employeeData = new int[numberOfEmployees][2]; // 2D array for [salary, years of service]

        for (int i = 0; i < numberOfEmployees; i++) {
            // Random salary in the range of 10000 to 99999
            int salary = rand.nextInt(90000) + 10000;
            // Random years of service in the range of 1 to 20
            int yearsOfService = rand.nextInt(20) + 1;
            
            employeeData[i][0] = salary;             // Old salary
            employeeData[i][1] = yearsOfService;      // Years of service
        }
        
        return employeeData;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateNewSalaryAndBonus(int[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3]; // [new salary, bonus amount]

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonus;

            // Determine bonus based on years of service
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05;
            } else {
                bonus = oldSalary * 0.02;
            }

            double newSalary = oldSalary + bonus;

            // Store new salary and bonus
            updatedData[i][0] = newSalary; // New salary
            updatedData[i][1] = bonus;      // Bonus amount
        }

        return updatedData;
    }

    // Method to calculate total amounts and display in tabular format
    public static void calculateAndDisplayTotals(int[][] employeeData, double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", "Old Salary", "Years of Service", "New Salary", "Bonus", "Total Bonus");
        System.out.println("-----------------------------------------------------------------");

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double newSalary = updatedData[i][0];
            double bonus = updatedData[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            // Display individual results
            System.out.printf("%-10d %-10d %-10.2f %-10.2f %-10.2f%n", oldSalary, yearsOfService, newSalary, bonus, totalBonus);
        }

        System.out.println("-----------------------------------------------------------------");
        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);
        System.out.printf("Total Bonus Amount: %.2f%n", totalBonus);
    }

    // Main method
    public static void main(String[] args) {
        int numberOfEmployees = 10;

        // Generate salaries and years of service
        int[][] employeeData = getSalaryAndYears(numberOfEmployees);

        // Calculate new salary and bonus
        double[][] updatedData = calculateNewSalaryAndBonus(employeeData);

        // Calculate totals and display results
        calculateAndDisplayTotals(employeeData, updatedData);
    }
}