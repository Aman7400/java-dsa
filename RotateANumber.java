import java.util.Scanner;

public class RotateANumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            int num = sc.nextInt();
            int rotBy = sc.nextInt();

            int numLen = (int) Math.log10(num) + 1;
            // For large rotations, we can take % because for mutiples of rotation
            // of same length as number, we get same number
            rotBy = rotBy % numLen;
            // If rotBy is negative, make it numLen + rotBy to get positive rotation
            if (rotBy < 0) {
                rotBy = numLen + rotBy;
            }

            // find divisor & multiplier
            int divisor = (int) Math.pow(10, rotBy);
            int quotient = num / divisor;
            int rem = num % divisor;
            int multiplier = (int) Math.log10(quotient) + 1;
            int rotatedNum = (rem * (int) Math.pow(10, multiplier)) + quotient;
            System.out.println(rotatedNum + " ");
        } catch (Exception e) {
            System.err.println(e);
        }

    }
}

// !Rotate A Number
// for n = 12345, rotBy = 2
// Output: 45123 -> moving last two digit to front
// for n = 12345, rotBy = -2
// Output: 34512 -> moving first two digit to back