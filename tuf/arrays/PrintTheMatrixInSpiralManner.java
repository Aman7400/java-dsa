package tuf.arrays;

import java.util.ArrayList;

public class PrintTheMatrixInSpiralManner {
    public static void main(String[] args) {
        System.out.println(ptmism(new int[][] { new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 }, new int[] { 7, 8, 9 } }));
    }

    static ArrayList<Integer> ptmism(int arr[][]) {
        ArrayList<Integer> pattern = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;
        int top = 0;
        int left = 0;
        int right = n - 1;
        int bottom = m - 1;

        while (top <= bottom && left <= right) {
            // Right
            for (int i = left; i <= right; i++) {
                pattern.add(arr[top][i]);
            }
            top++;
            // Down
            for (int i = top; i <= bottom; i++) {
                pattern.add(arr[i][right]);
            }
            right--;
            // Left
            if (top <= bottom) {

                for (int i = right; i >= left; i--) {
                    pattern.add(arr[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                // Up
                for (int i = bottom; i >= top; i--) {
                    pattern.add(arr[i][left]);
                }
                left++;
            }
        }
        return pattern;
    }
}
