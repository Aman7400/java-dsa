// ? Print all the digits of a given number input

import java.util.Scanner;

public class PrintDigitsOfNo {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // ! Convert to String and then iterate
            // String num = Integer.toString(n);
            // for (int i = 0; i < num.length(); i++) {
            // System.out.println(num.charAt(i));
            // }

            // ! Using Modulus Operator - gives reversed digits -> 1234 => 4321
            // while (n > 0) {
            // int rem = n % 10;
            // System.out.println(rem);
            // n = n / 10;
            // }

            // ! Pep Coding Logic : count no of digits, then find a divisor equals 10^n-1
            // ! and divide till divisor equals 0 and print the quotient
            int cod = (int) Math.log10(n) + 1;
            int div = (int) Math.pow(10, cod - 1);
            while (div != 0) {
                int quotient = n / div;
                System.out.println(quotient);
                n = n % div;
                div = div / 10;
            }

        } catch (Exception e) {
            System.err.println(e);
        }

    }
}


