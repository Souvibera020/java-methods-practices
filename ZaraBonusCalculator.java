import java.util.Random;

public class ZaraBonusCalculator {

    // Method to determine the salary and years of service
    public static double[][] generateEmployeeData(int numberOfEmployees) {
        Random random = new Random();
        double[][] employeeData = new double[numberOfEmployees][2]; // 2D array to hold salary and years of service

        for (int i = 0; i < numberOfEmployees; i++) {
            // Generate a random salary between 10000 and 99999
            double salary = 10000 + (random.nextDouble() * 90000);
            // Generate random years of service between 1 and 20
            int yearsOfService = 1 + random.nextInt(20);
            employeeData[i][0] = salary; // Salary
            employeeData[i][1] = yearsOfService; // Years of service
        }
        return employeeData;
    }

    // Method to calculate the new salary and bonus
    public static double[][] calculateNewSalariesAndBonuses(double[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3]; // 2D array to hold old salary, new salary, and bonus

        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            int yearsOfService = (int) employeeData[i][1];
            double bonus;

            // Calculate bonus based on years of service
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05; // 5% bonus
            } else {
                bonus = oldSalary * 0.02; // 2% bonus
            }

            double newSalary = oldSalary + bonus;
            updatedData[i][0] = oldSalary; // Old salary
            updatedData[i][1] = newSalary; // New salary
            updatedData[i][2] = bonus; // Bonus
        }
        return updatedData;
    }

    // Method to calculate the sum of old salary, new salary, and total bonus
    public static void calculateAndDisplayTotals(double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-15s %-15s %-15s %-15s%n", "Old Salary", "New Salary", "Bonus", "Years of Service");
        for (int i = 0; i < updatedData.length; i++) {
            double oldSalary = updatedData[i][0];
            double newSalary = updatedData[i][1];
            double bonus = updatedData[i][2];
            int yearsOfService = (int) (updatedData[i][0] / (1 + (bonus / oldSalary))); // Calculate years of service from old salary

            System.out.printf("%-15.2f %-15.2f %-15.2f %-15d%n", oldSalary, newSalary, bonus, yearsOfService);

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }

        System.out.printf("%-15s %-15s %-15s%n", "Total:", totalOldSalary, totalNewSalary);
        System.out.printf("%-15s %.2f%n", "Total Bonus:", totalBonus);
    }

    public static void main(String[] args) {
        int numberOfEmployees = 10;

        // Generate employee data
        double[][] employeeData = generateEmployeeData(numberOfEmployees);

        // Calculate new salaries and bonuses
        double[][] updatedData = calculateNewSalariesAndBonuses(employeeData);

        // Calculate and display totals
        calculateAndDisplayTotals(updatedData);
    }
}