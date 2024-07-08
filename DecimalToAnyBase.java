import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int baseToChange = sc.nextInt();
            int newNum = 0;
            int counter = 0;
            while (num > 0) {
                int rem = num % baseToChange;
                newNum = newNum + (rem * (int) Math.pow(10, (double) counter));
                counter++;
                num = num / baseToChange;
            }
            System.out.println(newNum);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
