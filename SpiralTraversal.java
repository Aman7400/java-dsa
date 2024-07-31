import java.util.Scanner;

public class SpiralTraversal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            int arr[][] = new int[n][m];

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int minr = 0;
            int minc = 0;

            int maxr = arr.length - 1;
            int maxc = arr[0].length - 1;

            int tne = n * m;
            int count = 0;

            while (count < tne) {
                // ? left wall
                // columm is fixed, row increases top down
                for (int i = minr, j = minc; i <= maxr && count < tne; i++) {
                    System.out.println(arr[i][j]);
                    count++;
                }
                minc++;
                // ? bottom wall
                // row is fixed, column increases left to right ->
                for (int i = maxr, j = minc; j <= maxc && count < tne; j++) {
                    System.out.println(arr[i][j]);
                    count++;
                }
                maxr--;

                // ? right wall
                // maxc is fixed, row changes bottom up ->
                for (int i = maxr, j = maxc; i >= minr && count < tne; i--) {
                    System.out.println(arr[i][j]);
                    count++;
                }
                maxc --;

                // ? top wall
                // row is fixed, column decreaes right to left <-
                for (int i = maxc; i >= 0 && count < tne; i--) {
                    System.out.println(arr[minr][i]);
                    count++;
                }
                minr++;
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
