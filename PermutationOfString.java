public class PermutationOfString {
    public static void main(String[] args) {

        String str = "abc";

        int len = str.length();
        int fact = factorial(len);

        for (int i = 0; i < fact; i++) {
            int temp = i;
            StringBuilder str2 = new StringBuilder(str);

            for (int div = len; div >= 1; div--) {

                int quo = temp / div;
                int rem = temp % div;

                System.out.print(str2.charAt(rem));
                str2.deleteCharAt(rem);

                temp = quo;
            }
            System.out.println();
        }

    }

    public static int factorial(int num) {

        int fact = 1;

        for (int i = 2; i <= num; i++) {
            fact *= i;
        }

        return fact;

    }
}
