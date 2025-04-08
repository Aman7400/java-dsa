package tuf.binarysearch;

public class UpperBound {
    public static void main(String[] args) {
        System.out.println(upperBound(new int[] {3,5,8,15,19 }, 3));
    }

    public static int upperBound(int[] nums, int x) {

        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length; // ! Need to check why ?

        while (low <= high) {
            int mid = (low + high) / 2 ;
            if (nums[mid]> x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        

        return ans;

    }

}
