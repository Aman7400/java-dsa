package tuf.binarysearch.logicBuilding;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int ans[] = searchRangeUsingBinarySearch(new int[] { 5, 7, 7, 8, 8, 10 }, 6);

        for (int i : ans) {
            System.out.println(i);
        }

        System.out.println();
    }

    // ! Linear Search
    // Time Complexity - O(n)
    public static int[] searchRangeLinear(int[] nums, int target) {
        int start = -1;
        int end = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (start == -1) {
                    start = i;
                }
                end = i;
            }
        }
        if (start == -1) {
            return new int[] { -1, -1 };
        } else {
            return new int[] { start, end };
        }

    }

    // ! Using Bounds
    // Lower Bound => arr[i] >= x => gets you first occurence
    // Upper Bound => arr[i] > x; => subtracting 1 from upper_bound gives last
    // occurence
    // Time Complexity -> O(logN)

    public static int[] searchRangeUsingBounds(int[] nums, int target) {

        int firstOcc = getLowerBound(nums, target);

        // Check if the target is present in the array or not if first occurence is
        // not there no there won't be last as well
        if (firstOcc == nums.length || nums[firstOcc] != target)
            return new int[] { -1, -1 };

        return new int[] { firstOcc, getUpperBound(nums, target) - 1 };

    }

    public static int getLowerBound(int[] nums, int x) {

        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static int getUpperBound(int[] nums, int x) {

        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    // ! Using Binary Search
    // Time Complexity -> O(logN)
    public static int[] searchRangeUsingBinarySearch(int nums[], int target) {

        int firstOcc = getFirstOccurence(nums, target);

        if (firstOcc == -1) {
            return new int[] { -1, -1 };
        }

        return new int[] { firstOcc, getLastOccurence(nums, target) };

    }

    public static int getFirstOccurence(int[] nums, int x) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == x) {
                ans = mid;
                high = mid - 1;
            } else if (nums[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static int getLastOccurence(int[] nums, int x) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == x) {
                ans = mid;
                low = mid + 1;
            } else if (nums[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

}
