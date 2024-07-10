import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int base = sc.nextInt();
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            System.out.println(getSum(base, num1, num2));

            
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static int getSum(int base, int num1, int num2){
        int sum = 0;
        int carry = 0;
        int pow = 1;

        while (num1 > 0 || num2 > 0 || carry > 0) {

            int d1 = num1 % 10;
            int d2 = num2 % 10;

            num1 = num1 / 10;
            num2 = num2 / 10;

            int d = d1 + d2 + carry;
            carry = d / base;
            d = d % base;

            sum = sum + d * pow;
            pow = pow * 10;
                
        }



        return sum;
    }
}
