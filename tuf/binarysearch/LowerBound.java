package tuf.binarysearch;

public class LowerBound {
    public static void main(String[] args) {
        System.out.println(lowerBound(new int[] {3,5,8,15,19 }, 3));
    }

    // ! Brute

    public static int lowerBound(int[] nums, int x) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // ? Handle Overflow cases where in right = INT_MAX so doing the
                                                 // operation for when left=right gives overflow

            if (nums[mid] >= x) 
                return mid;

            } else {
                left = left + 1;
            }
        }

        return nums.length;

    }
}
