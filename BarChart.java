import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Find Max : height of the Bar
            int max = arr[0];
            for (int i = 0; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            // Draw Bar from top to bottom

            for (int floor = max; floor >= 1; floor--) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] >= floor) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }
                System.out.println();

            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
