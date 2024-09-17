package tuf.sorting;

// ? Time Complexity O(nlogn)
// ? Space Complexity O(n)

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = new int[] { 5, 4, 3, 2, 1 };
        ms(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void ms(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        ms(arr, low, mid);
        ms(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    static void merge(int arr[], int low, int mid, int high) {
        int res[] = new int[high-low+1];
        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                res[k++] = arr[i++];
            } else {
                res[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            res[k++] = arr[i++];
        }
        while (j <=high) {
            res[k++] = arr[j++];
        }

        for (k = 0; k < res.length; k++) {
            arr[low+k] = res[k];
        }

    }
}
