import java.util.Scanner;

public class PrimeForGivenRange {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int low = sc.nextInt();
            int high = sc.nextInt();

            for (int n = low; n <= high; n++) {
                int counter = 0;
                for (int i = 2; i < Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        counter += 1;
                        break;
                    }
                }
                if (counter == 0) {
                    System.out.println(n);
                }
            }
        }

    }
}
