package tuf.arrays;

public class ReversePairs {
    public static void main(String[] args) {
        System.out.println(reversePairsOptimal(new int[] { 6, 4, 1, 2, 7 }));
    }

    // ! Brute
    // Time Complexity: O(N2),
    // Space Complexity: O(1)
    public static int reversePairs(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > (nums[j] * 2)) {
                    counter += 1;
                }
            }
        }
        return counter;
    }

    public static int reversePairsOptimal(int[] nums) {
        int counter = 0;
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] > (nums[j] * 2)) {
                counter++;
                j--;
            } else {
                i++;
                j--;
            }
        }
        return counter;
    }
}
