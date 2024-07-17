import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // arr0
            int n0 = sc.nextInt();
            int m0 = sc.nextInt();
            int arr0[][] = new int[n0][m0];

            for (int i = 0; i < n0; i++) {
                for (int j = 0; j < m0; j++) {
                    arr0[i][j] = sc.nextInt();
                }
            }

            // arr1
            int n1 = sc.nextInt();
            int m1 = sc.nextInt();
            int arr1[][] = new int[n1][m1];

            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m1; j++) {
                    arr1[i][j] = sc.nextInt();
                }
            }

            // check if multiplication is possible
            if (m0 != n1) {
                System.out.println("Invalid Input");
                return;
            }

            int product[][] = new int[n0][m1];

            for (int i = 0; i < n0; i++) {
                for (int j = 0; j < m1; j++) {
                    for (int k = 0; k < m0; k++) { // No of times to multiply and sum depends on the common column and row for two matixs
                        product[i][j] += arr0[i][k] * arr1[k][j];
                    }
                }
            }

            // Print
            for (int i = 0; i < product.length; i++) {
                for (int j = 0; j < product[i].length; j++) {
                    System.out.print(product[i][j] + "\t");
                }
                System.out.println();
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
