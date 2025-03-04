import java.util.ArrayList;
import java.util.List;

public class NumberChecker {
    
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }
    
    public static int[] storeDigits(int number) {
        List<Integer> digitList = new ArrayList<>();
        number = Math.abs(number);
        while (number > 0) {
            digitList.add(number % 10);
            number /= 10;
        }
        int[] digits = new int[digitList.size()];
        for (int i = 0; i < digitList.size(); i++) {
            digits[i] = digitList.get(digitList.size() - 1 - i);
        }
        return digits;
    }
    
    public static boolean isDuckNumber(int number) {
        String numStr = String.valueOf(Math.abs(number));
        return numStr.contains("0") && numStr.charAt(0) != '0';
    }
    
    public static boolean isArmstrongNumber(int number) {
        int sum = 0, temp = number, count = countDigits(number);
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }
        return sum == number;
    }
    
    public static void findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        System.out.println("Largest: " + largest + ", Second Largest: " + secondLargest);
    }
    
    public static void findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        System.out.println("Smallest: " + smallest + ", Second Smallest: " + secondSmallest);
    }
    
    public static void main(String[] args) {
        int number = 153; // Example number
        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countDigits(number));
        
        int[] digits = storeDigits(number);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();
        
        System.out.println("Is Duck Number? " + isDuckNumber(number));
        System.out.println("Is Armstrong Number? " + isArmstrongNumber(number));
        
        findLargestAndSecondLargest(digits);
        findSmallestAndSecondSmallest(digits);
    }
}
