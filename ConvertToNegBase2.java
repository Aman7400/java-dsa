import java.util.Scanner;

public class ConvertToNegBase2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int counter = 0;
            int newNum = 0;

            while (n > 0) {
                int rem = n % -2;
                newNum = newNum + (rem * (int) (Math.pow(10, counter)));
                counter++;
                n = n / 2;
            }

            System.out.println(newNum);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}