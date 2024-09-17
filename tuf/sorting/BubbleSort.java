package tuf.sorting;

// ? Find the maximum and swap adjacently;
// ? Time Complexity : O[n^2] for worst and avg case; O[n] for best when array is sorted
// ? Space Complexity : O(1) as it is an in-place sorting algorithm and does not require additional storage proportional to the input size.


public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = new int[] { 1,2,3,4,5 };
        bs(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    // ? Too optimise add a swap check, for already sorted array;
    static void bs(int arr[], int n){
        boolean didNotSwap = false;
        for (int i = n - 1 ; i > 0; i--) {
            for (int j = 0; j <= i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didNotSwap = true;
                }
            }
            if (!didNotSwap) {
                break;
            }
        }

    }
}
