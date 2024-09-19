package tuf.arrays;

public class LeftRotateArraybyKPlaces {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6 };
        // lfbkbr(arr, 2, arr.length);
        lfbkbs(arr,2,arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // ! Brute Force - Shifting the n-k elements and then adding k elements at last
    // ? Time Complexity: O[n+k]
    // ? Space Complexity: O[k] 
    static void lfbkbs(int arr[], int k, int n) {
        k = k % n;

        int temp[] = new int[k];
        
        // Save
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }


        // Shift
        for (int i = k; i < n; i++) {
            arr[i-k] = arr[i];
        }


        // Merge
        int j = 0;
        for (int i = n-k; i < n; i++) {
            arr[i] = temp[j];
            j++;
        }
       
    


    }

    // ? Optimal - Shifting the n-k elements and then adding k elements at last
    // ? Time Complexity: O[2n]
    // ? Space Complexity: O[1] (no extra space used)
    static void lfbkbr(int arr[], int k, int n) {
        k = k % n;
        reverse(arr, 0, k - 1);
        reverse(arr, k , n - 1);
        reverse(arr, 0, n - 1);
    }

    static void reverse(int arr[], int i, int j) {

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}
