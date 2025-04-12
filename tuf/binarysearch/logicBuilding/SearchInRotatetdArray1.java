package tuf.binarysearch.logicBuilding;

public class SearchInRotatetdArray1 {
    public static void main(String[] args) {
        System.out.println(searchArry(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 5));
    }

    // Brute
    // ! Linear search - O(N)

    // Optimal
    // ! Binary search - O(logN)
    // ! find the sorted half and search since arr[] is rotated 

    public static int searchArry(int nums[], int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // Left sorted check
            if (nums[low] <= nums[mid]) {
                // target lies in this sorted half
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // Rigth sorted check
            else {
                // target lies in this sorted half
                if (nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}
