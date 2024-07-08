import java.util.Scanner;

public class GcdNLcm {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            int on1 = n1;
            int on2 = n2;
            // Using Divisor Method for GCD
            while (n1 % n2 != 0) {
                int rem = n1 % n2;
                n1 = n2;
                n2 = rem;

            }
            int gcd = n2;
            int lcm = (on1 * on2) / gcd; // LCM = (n1*n2)/GCD
            System.out.println("GCD: " + gcd + " LCM:" + lcm);

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
