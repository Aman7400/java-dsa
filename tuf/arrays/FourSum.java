package tuf.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        System.out.println(fso(new int[] { 1, -2, 3, 5, 7, 9 }, 7));
    }

    // ! Optimal
    // ? T.C -> O(N3), as each of the pointers i and j, is running for approximately
    // N
    // times. And both the pointers k and l combined can run for approximately N
    // times including the operation of skipping duplicates.
    // ? S.C -> O[1] no extra space, O[no of quadruplets] -> to return ans

    
    static List<List<Integer>> fso(int[] arr, int target) {
        List<List<Integer>> quadruplets = new ArrayList<>();
        // Sort
        Arrays.sort(arr);
        // Fix 2 numbers and then we find other two using 2 pointer
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }
                int k = j + 1;
                int l = arr.length - 1;
                while (k < l) {
                    int sum = arr[i] + arr[j] + arr[k] + arr[l];
                    if (sum == target) {
                        List<Integer> q = new ArrayList<>();
                        q.add(arr[i]);
                        q.add(arr[j]);
                        q.add(arr[k]);
                        q.add(arr[l]);
                        quadruplets.add(q);

                        k++;
                        l--;
                        while (k < l && arr[k] == arr[k - 1])
                            k++;
                        while (k < l && arr[l] == arr[l + 1])
                            l--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }

        return quadruplets;
    }
}
