package tuf.binarysearch.logicBuilding;

import java.util.ArrayList;
import java.util.Collections;

public class FindMinInRotSortArr {
    public static void main(String[] args) {
        int arr[] = new int[] { 4, 5, 6, 7, -7, 1, 2, 3 };
        ArrayList<Integer> nums = new ArrayList<>();
        for (int num : arr) {
            nums.add(num);
        }

        System.out.println(findMinOpt(nums));
    }

    // ! Brute force Time Complexity - O(nlogn)
    public static int findMin(ArrayList<Integer> arr) {
        Collections.sort(arr);
        return arr.get(0);
    }

    // ! Optimised Time Complexity - O(logn)
    // ! find the sorted half -> then find min in sorted half and eliminate it
    public static int findMinOpt(ArrayList<Integer> arr) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            // if (arr.get(low) <= arr.get(high)) {
            //     ans = arr.get(low);
            // }
            if (arr.get(low) <= arr.get(mid)) {
                ans = Math.min(ans, arr.get(low));
                low = mid + 1;
            } else {
                ans = Math.min(ans, arr.get(mid));
                high = mid - 1;
            }
           
        }
        return ans;

    }
}
