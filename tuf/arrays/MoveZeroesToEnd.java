package tuf.arrays;

// ! Optimal
// ? Time Complexity:O(n) 
// ? Space Complexity:O(1) 

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int arr[] = new int[] { 0, 1, 4, 0, 5, 2 };
        mze(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void mze(int arr[]) {
        // find first index of 0
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        // Swap the non zeroes
        if (j != -1) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i] != 0) {
                    swap(arr, i, j);
                    j++;
                }
            }
        }
    }

    static void swap(int arr[], int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

}
