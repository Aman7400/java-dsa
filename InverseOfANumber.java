import java.util.Scanner;

public class InverseOfANumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int inverse = 0;
            int pos = 0;
            while (num != 0) {
                int rem = num % 10;
                ++pos;
                inverse = inverse + (pos * (int) Math.pow(10, rem - 1));
                num = num / 10;
            }
            System.out.println(inverse);
        } catch (Exception e) {
            System.err.println(e);
        }

    }
}

// for a given number [1 5 2 3 4]
// inverse is [4 1 2 3 5]
// replace the number with on its index
// https://youtu.be/dbk42TKwk4M?si=wq5QzY4libwd1NZc
