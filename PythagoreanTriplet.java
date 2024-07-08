import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();

            // First find the greatest of 3 numbers to make it as H
            int h, b, p = 0;
            if (n1 > n2 && n1 > n3) {
                h = n1;
                b = n2;
                p = n3;
            } else if (n2 > n1 && n2 > n3) {
                h = n2;
                b = n1;
                p = n3;
            } else {
                h = n3;
                b = n1;
                p = n2;
            }

            // Check for h^2 = p^2 + b^2
            if ((h * h == ((p * p) + (b * b)))) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
