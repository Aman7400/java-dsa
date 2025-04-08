package tuf.binarysearch.logicBuilding;

public class SearchInsertPost {
    public static void main(String[] args) {

        System.out.println(searchInsert(new int[] { 1, 3, 5, 6 }, 7));

    }

    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length; // ! Need to check why ?

        while (low <= high) {
            int mid = (low + high) / 2 ;
            if (nums[mid]>= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
