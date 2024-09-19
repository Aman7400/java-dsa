package tuf.arrays;

//! Optimal
//? Time Complexity: O(N)
//? Space Complexity: O(1) 

public class SecondLargestElement {
    public static void main(String[] args) {
        System.out.println(sle(new int[] { 8, 8, 7, 6, 5 }));
    }

    static int sle(int arr[]) {
        int max = arr[0];
        int sMax = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                sMax = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > sMax) {
                sMax = arr[i];
            }
        }

        return sMax;
    }
}
