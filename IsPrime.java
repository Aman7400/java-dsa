import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int number = sc.nextInt();
            if (number <2) {
                System.out.println("Not PRime");
                return;
            }
            int counter = 0;


            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    counter += 1;
                    break;
                }
            }

            if (counter > 1) {
                System.out.println("Not Prime");
            } else {
                System.out.println("Prime");
            }
        }

    }

}

// To check if a number n is prime:
// 1. Test divisibility up to sqrt(n).
// 2. If n is divisible by any number up to sqrt(n), it's not prime; otherwise,it's prime.
// Time complexity: O(√n)
