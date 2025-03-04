import java.util.Scanner;

public class YoungestAndTallestFriends {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input for ages
        System.out.println("Enter the ages of Amar, Akbar, and Anthony:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Age of friend " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        // Input for heights
        System.out.println("Enter the heights of Amar, Akbar, and Anthony (in meters):");
        for (int i = 0; i < 3; i++) {
            System.out.print("Height of friend " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }

        // Find the youngest friend
        String youngestFriend = findYoungestFriend(ages);
        System.out.println("The youngest friend is: " + youngestFriend);

        // Find the tallest friend
        String tallestFriend = findTallestFriend(heights);
        System.out.println("The tallest friend is: " + tallestFriend);

        scanner.close();
    }

    // Method to find the youngest friend
    public static String findYoungestFriend(int[] ages) {
        int youngestAge = ages[0];
        int youngestIndex = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestIndex = i;
            }
        }

        switch (youngestIndex) {
            case 0: return "Amar";
            case 1: return "Akbar";
            case 2: return "Anthony";
            default: return "Unknown";
        }
    }

    // Method to find the tallest friend
    public static String findTallestFriend(double[] heights) {
        double tallestHeight = heights[0];
        int tallestIndex = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestIndex = i;
            }
        }

        switch (tallestIndex) {
            case 0: return "Amar";
            case 1: return "Akbar";
            case 2: return "Anthony";
            default: return "Unknown";
        }
    }
}