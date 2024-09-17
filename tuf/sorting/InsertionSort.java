package tuf.sorting;

// ? Take the element and place it at its correct position
// ? Time Complexity: O(N2) for the worst and average cases, best-case time complexity when the array is already sorted -> O(N).
// ? Space Complexity: O(1)

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = new int[] { 5,4,3,2,1 };
        is(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    // ? take the element keep checking and swapping till left most element 
    static void is(int arr[], int n){
        for (int i = 0; i <= n-1; i++) {
            int j = i;
            while (j>0 && arr[j-1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
