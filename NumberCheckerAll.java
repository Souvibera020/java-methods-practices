public class NumberCheckerAll {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String strNumber = String.valueOf(number);
        String strSquare = String.valueOf(square);
        return strSquare.endsWith(strNumber);
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || String.valueOf(number).endsWith("7");
    }

    public static void main(String[] args) {
        int number = 7; // Example number

        // Check if prime
        boolean prime = isPrime(number);
        System.out.println("Is prime: " + prime);

        // Check if neon
        boolean neon = isNeon(number);
        System.out.println("Is neon: " + neon);

        // Check if spy
        boolean spy = isSpy(number);
        System.out.println("Is spy: " + spy);

        // Check if automorphic
        boolean automorphic = isAutomorphic(number);
        System.out.println("Is automorphic: " + automorphic);

        // Check if buzz
        boolean buzz = isBuzz(number);
        System.out.println("Is buzz: " + buzz);
    }
}