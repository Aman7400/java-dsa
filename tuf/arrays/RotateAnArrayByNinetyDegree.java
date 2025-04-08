package tuf.arrays;

public class RotateAnArrayByNinetyDegree {
    public static void main(String[] args) {
        int arr[][] = new int[][] { new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 }, new int[] { 7, 8, 9 } };
        raabnd(arr);
    }

    // ! Optimal - Find transpose of [] (row -> col) and then reverse each row;
    static void rotateAnArrayByTransposeAndReversal(int arr[][]) {
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 1; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            reverse(arr[i], i, arr.length - 1);
        }
    }

    static void reverse(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // ! Brute
    // ? Time Complexity: O[n*n] -> traversing all elements
    // ? Space Complexity: O[n*n] -> storing the result
    static void raabnd(int arr[][]) {
        int n = arr.length; // assuming a sq matrix so n = m;
        int temp[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[j][n - 1 - i] = arr[i][j];
            }
        }
    }
}
