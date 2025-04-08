package tuf.arrays;

import java.util.Arrays;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 0, 2, 1, 0 };
        szotb(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // ! Optimal - Dutch National flag algorithm variation
    // ? Time Complexity: O[n]
    // ? Space Complexity: O[1]
    static void szoto(int arr[]) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // ! Brute
    // ? Time Complexity: O[nlogn]
    static void szot(int arr[]) {
        Arrays.sort(arr);
    }

    // ! Better
    // ? Time Complexity: O[2n];
    // ? Space Complexity: O[1]
    static void szotb(int arr[]) {

        int freq[] = new int[3];

        // Count Frequenceis;
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        // Fill arr based on frequency
        for (int i = 0; i < freq[0]; i++) {
            arr[i] = 0;
        }
        for (int i = freq[0]; i < (freq[0] + freq[1]); i++) {
            arr[i] = 1;
        }
        for (int i = freq[0] + freq[1]; i < (freq[0] + freq[1] + freq[2]); i++) {
            arr[i] = 2;
        }

    }
}
