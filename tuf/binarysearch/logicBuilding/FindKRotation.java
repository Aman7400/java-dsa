package tuf.binarysearch.logicBuilding;

import java.util.ArrayList;

public class FindKRotation {
    public static void main(String[] args) {

        int arr[] = new int[] { 4, 5, 6, 7, 0, 1, 2, 3};
        ArrayList<Integer> nums = new ArrayList<>();
        for (int num : arr) {
            nums.add(num);
        }

        System.out.println(findKRotation(nums));

    }

    // ! Brute Force -> Time Complexity: O(n)

    public static int findKRotation(ArrayList<Integer> nums) {

        int min = Integer.MAX_VALUE;
        int pos = 0;

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = (int) nums.get(i);
                pos = i;
            }
        }

        return pos;

    }
}
