package tuf.binarysearch.logicBuilding;

public class FloorAndCeiling {
    public static void main(String[] args) {

        int ans[] = getFloorAndCeil(new int[] { 2, 4, 6, 8, 10, 12, 14 }, 1);

        for (int i : ans) {
            System.out.println(i);
        }

        System.out.println();
    }

    public static int findCeil(int[] nums, int x) {
        int ans = -1;

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= x) {
                ans = nums[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static int findFloor(int[] nums, int x) {
        int ans = -1;

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] <= x) {
                ans = nums[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static int[] getFloorAndCeil(int[] nums, int x) {
        return new int[] { findFloor(nums, x), findCeil(nums, x) };
    }

}
