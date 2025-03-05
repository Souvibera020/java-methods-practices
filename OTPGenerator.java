import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {
    
    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }
    
    // Method to validate uniqueness of OTPs
    public static boolean validateUniqueOTPs(int[] otps) {
        Set<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            otpSet.add(otp);
        }
        return otpSet.size() == otps.length;
    }
    
    public static void main(String[] args) {
        int[] otps = new int[10];
        
        // Generate 10 OTPs
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("Generated OTP: " + otps[i]);
        }
        
        // Validate uniqueness
        if (validateUniqueOTPs(otps)) {
            System.out.println("All generated OTPs are unique.");
        } else {
            System.out.println("Some OTPs are duplicate.");
        }
    }
}
