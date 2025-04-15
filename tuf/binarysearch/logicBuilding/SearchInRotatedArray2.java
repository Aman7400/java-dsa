package tuf.binarysearch.logicBuilding;

import java.util.ArrayList;

public class SearchInRotatedArray2 {
    public static void main(String[] args) {
        int arr[] = new int[] { 3, 1, 2, 3, 3, 3, 3 };

        ArrayList<Integer> nums = new ArrayList<>();
        for (int num : arr) {
            nums.add(num);
        }

        System.out.println(searchArry(nums, 3));

    }

    // ! in worst case time complexity - O(n/2) -> if we have many duplicates ; avg case -> O(logN)
    public static boolean searchArry(ArrayList<Integer> nums, int k) {

        int low = 0;
        int high = nums.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums.get(mid) == k) {
                return true;
            }
            if (nums.get(low).equals(nums.get(mid)) && nums.get(mid).equals(nums.get(high))) {
                low += 1;
                high -= 1;
                continue;
            }

            if (nums.get(low) <= nums.get(mid)) {
                if (nums.get(low) <= k && k <= nums.get(mid)) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums.get(mid) <= k && k <= nums.get(high)) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

        }

        return false;
    }
}
