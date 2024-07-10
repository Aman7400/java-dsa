import java.util.Scanner;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int base = sc.nextInt();
            // n2 > n1
            int n2 = sc.nextInt();
            int n1 = sc.nextInt();

            System.out.println(getAnyBaseSubtraction(base,n2,n1));

            
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static int getAnyBaseSubtraction(int base, int num2, int num1) {
        int rV = 0;
        int carry = 0;
        int pow = 1;

        while (num2 > 0) {
            int d1 = num1 % 10;
            int d2 = num2 % 10;

            num1 = num1 / 10;
            num2 = num2 / 10;

            int d = 0;
            // Add Carry before subtraction
            d2 = d2 + carry;

            // if d2 >= d1, no need of borrowing, do subtraction and set carry 0
            // else borrow and set carry to 1 and add base to d2 before subtraction
            if (d2 >= d1) {
                carry = 0;
                d = d2 - d1;
            } else {
                carry = -1;
                d = (d2 + base) - d1;
            }


            rV = rV + d * pow;
            pow = pow * 10;
            


        }

        return rV;
    }
}
