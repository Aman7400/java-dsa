package tuf.arrays;

import java.util.ArrayList;
import java.util.List;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        System.out.println(katro(new int[] { 2, 3, 5, -2, 7, -4 }));
    }

    // ! Optimal Approach
    /*
     * The idea is to store the starting index and the ending index of the subarray.
     * Thus its easily possible to get the subarray with maximum sum afterward
     * without actually storing the subarray elements. On careful observation we can
     * notice that the subarray always starts at the particular index where the sum
     * variable is equal to 0, and at the ending index, the sum always crosses the
     * previous maximum sum. Using this observation print the subarray with maximum
     * sum.
     */
    // ? T.C -> O[n]
    // ? S.C -> O[1]
    static int kao(int arr[]) {

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        return max;

    }

    // ? Returns subarray with maximum sum
    static List<Integer> katro(int arr[]) {

        int max = Integer.MIN_VALUE;
        int sum = 0;
        int ansStart = -1;
        int ansEnd = -1;
        int start = -1;

        for (int i = 0; i < arr.length; i++) {

            if (sum == 0) {
                start = i;
            }

            sum += arr[i];

            if (sum > max) {
                max = sum;
                ansStart = start;
                ansEnd = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = ansStart; i <= ansEnd; i++) {
            ans.add(arr[i]);
        }

        return ans;

    }
}
