package tuf.binarysearch;

public class SearchXInASortedArray {
    public static void main(String[] args) {
        System.out.println(rSearch(new int[] { -1, 0, 3, 5, 9, 12 },0,5, 9));
    }

    // ! Brute
    // Time Complexity: O(logn),
    // Space Complexity: O(1)

    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right -left) / 2; // ? Handle Overflow cases where in right = INT_MAX so doing the operation for when left=right gives overflow

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = left + 1;
            }
        }

        return -1;
    }

    // ! Recursive
    public static int rSearch(int[] nums, int left, int right, int target) {

        if (left > right) {
            return -1;
        }

        int mid =  left + (right -left) / 2; // ? Handle Overflow cases where in right = INT_MAX so doing the operation for when left=right gives overflow

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return rSearch(nums, left, mid - 1, target);
        }
        return rSearch(nums, mid + 1, right, target);

    }

}
