package tuf.arrays;

// ? Time Complexity: O(N), 
// ? Space Complexity: O(1)


public class LeftRotateAnArrayByOne {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5 };
        lfbo(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void lfbo(int arr[]) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }
}
