package tuf.sorting;

// ? Find the minimum and swipe the current value at i;
// ? Time Complexity : O[n^2] for worst,best and avg case;
// ? Space Complexity : O(1) as it is an in-place sorting algorithm and does not require additional storage proportional to the input size.

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = new int[] { 7, 4, 1, 5, 3 };
        ss(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    
    static void ss(int arr[]) {
        for (int i = 0; i <= arr.length - 2; i++) {
            int min = i;
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // ? Swipe only if i != min; for large test cases it was failing without it
            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }

}
