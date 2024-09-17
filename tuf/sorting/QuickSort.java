package tuf.sorting;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = new int[] { 5, 4, 3, 2, 1 };
        qs(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static int getPartition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            /* Move i to the right until we find an element greater than the pivot */
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            /* Move j to the left until we find an element smaller than the pivot */
            while (arr[j] > pivot && i >= low + 1) {
                j--;
            }

            if (i < j) {
                swap(arr, i, j);
            }
        }
        // place pivot in correct position
        swap(arr, low, j);
        return j;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void qs(int arr[], int low, int high) {
        if (low < high) {
            // find partition
            int partition = getPartition(arr, low, high);
            // sort left
            qs(arr, low, partition - 1);
            // sort right
            qs(arr, partition + 1, high);
        }

    }
}
