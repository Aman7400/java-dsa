import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max = arr[0];
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                int num = arr[i];
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }

            // Span = Max - Min
            System.out.println(max - min);

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
