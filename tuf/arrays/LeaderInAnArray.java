package tuf.arrays;

import java.util.ArrayList;
import java.util.Collections;

// ! Optimal
//? Time Complexity:O(N), 
//?Space Complexity: O(1), as extra space to store answer is not considered.

public class LeaderInAnArray {
    public static void main(String[] args) {

        // System.out.println(lia(new int[] { 1, 2, 5, 3, 1, 2 }));
        System.out.println(lia(new int[] { -3, 4, 5, 1, -30, -10 }));
    }

    static ArrayList<Integer> lia(int[] nums) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int n = nums.length;

        leaders.add(nums[n - 1]);

        int maxRight = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > maxRight) {
                maxRight = nums[i];
                leaders.add(nums[i]);
            }

        }
        // Reverse to maintain order
        Collections.reverse(leaders);
        return leaders;
    }
}
