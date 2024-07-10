import java.util.Scanner;

public class AnyBaseMultiplication {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int base = sc.nextInt();
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            int finalProd = 0;
            int pow = 1;

           while (n1 > 0) {
            int prod = getProductOfSingleDigit(n1%10, n2, base);
            n1 = n1/10;
            finalProd = getSum(base, finalProd, prod*pow);
            pow = pow * 10;
           }

           System.out.println(finalProd);
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    public static int getProductOfSingleDigit(int d2, int n1, int base){
        int carry = 0;
        int rv = 0;
        int pow = 1;

        while (n1 > 0 || carry > 0) {
           int d1 = n1 % 10;
           n1 = n1/10;

           int d = d1*d2 + carry;
           carry = d / base;
           d = d % base;

           rv = rv + d * pow;
           pow = pow * 10;
        }
        return rv;
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


