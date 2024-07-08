import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int num = sc.nextInt();
            int digit = sc.nextInt();
            int counter = 0;

            while (num > 0) {
                int rem = num % 10;
                if (rem == digit) counter++;
                num = num / 10;
            }

            System.out.println(counter);
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
