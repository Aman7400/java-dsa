import java.util.HashSet;
import java.util.Set;

public class CounDigits {

    public static void main(String[] args) {
        System.out.println(evenlyDivides(22074));
    }

    static int evenlyDivides(int n) {
        int counter = 0;
        int original = Math.abs(n);

        Set<Integer> seenDigits = new HashSet<>();

        while (n != 0) {
            int digit = Math.abs(n % 10);
            System.out.println(digit);
            if (!seenDigits.contains(digit)) {
                if (digit != 0 && (original % digit == 0)) {
                    System.out.println(digit + "digit");
                    counter++;
                }
                seenDigits.add(digit);
            }
            n = n / 10;
        }
        return counter;
    }
}
