
import java.util.HashSet;
public class OTP {
    public static void main(String[] args) {
        int[] otpArray = new int[10];
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
        }

        if (areOTPsUnique(otpArray)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Duplicate OTPs found.");
        }
    }

    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000; // Generates a 6-digit number
    }

    public static boolean areOTPsUnique(int[] otpArray) {
        HashSet<Integer> otpSet = new HashSet<>();
        for (int otp : otpArray) {
            if (!otpSet.add(otp)) {
                return false; // Duplicate found
            }
        }
        return true; // All OTPs are unique
    }
}
