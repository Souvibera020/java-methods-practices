import java.util.Scanner;

public class WindChillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get temperature and wind speed as input
        System.out.print("Enter the temperature (in Fahrenheit): ");
        double temperature = scanner.nextDouble();
        
        System.out.print("Enter the wind speed (in mph): ");
        double windSpeed = scanner.nextDouble();
        
        // Calculate and display wind chill temperature
        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.println("Wind Chill Temperature: " + windChill);
        
        scanner.close();
    }
    
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
}
