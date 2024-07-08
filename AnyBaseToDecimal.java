import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int base = sc.nextInt();

            int counter = 0;
            int newNum = 0;

            while (num > 0) {
                int rem = num % 10;
                newNum += rem * (Math.pow(base, counter));
                counter++;
                num = num / 10;
            }

            System.out.println(newNum);

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
