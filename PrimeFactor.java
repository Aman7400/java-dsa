import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();

            for (int i = 2; i * i <= n; i++) {
                while (n % i == 0) {
                    n = n / i;
                    System.out.println(i);
                }
            }

            // if n hasn't become 1 after computation, it means current value of n is the
            // only number that comes after
            // root n and divides it
            // for 46, we have 2 & 23, but out loop will exit at 2 because of root of 23 is
            // 4, but our n still would be
            // 23 so we print it
            if (n != 1) {
                System.out.println(n);
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}

// ? Find all prime factors of a number
// https://youtu.be/5gFC-ayyQMk?si=rT1izalAVQmArOby