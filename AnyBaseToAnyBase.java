import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int base1 = sc.nextInt(); // given base
            int base2 = sc.nextInt(); // to convert base
            int counter = 0;
            int newNum = 0;

            // Convert from base 1 to Decimal
            int decNum = convertToDecimal(num,base1);
            // Convert from decimal to base 2
            newNum = decimalToAnyBase(decNum, base2);

            System.out.println(newNum);

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static int convertToDecimal(int num, int base) {

        int counter = 0;
        int newNum = 0;
        while (num > 0) {
            int rem = num % 10;
            newNum += rem * (Math.pow(base, counter));
            counter++;
            num = num / 10;
        }
        return newNum;

    }

    public static int decimalToAnyBase(int num, int baseToChange) {

        int newNum = 0;
        int counter = 0;
        while (num > 0) {
            int rem = num % baseToChange;
            newNum = newNum + (rem * (int) Math.pow(10, (double) counter));
            counter++;
            num = num / baseToChange;
        }
        return newNum;
    }
}
