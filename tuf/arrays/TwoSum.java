package tuf.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        // int res[] = tsb(new int[] { 1, 6, 2, 10, 3 }, 7);
        // for (int i : res) {
        //     System.out.print(i + " ");
        // }
        System.out.println(tso(new int[] { 1, 6, 2, 10, 3 }, 7));
    }

    // ! Brute Force
    // ? T.C - O[n^2]
    static int[] ts(int arr[], int target) {
        int res[] = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }

        return res;
    }

    //! Better
    //? T.C: O[n]
    //? S.C: O[n] for using the map data structure.

    static int[] tsb(int arr[], int target) {
        Map<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hash.containsKey(target - arr[i])) {
                return new int[] { hash.get(target - arr[i]), i };
            }
            hash.put(arr[i], i);
        }
        return new int[] { -1, -1 };
    }

    // ! Optimal - not good for the type when we return index of the elements that can create sum
    // ? T.C - O[n] + O[nlogn] (Sorting)
    // ? S.C - O[1]
    static String tso(int arr[], int target){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left<right) {
            if (arr[left] + arr[right] == target) {
                return "Yes";
            } else if (arr[left] + arr[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return "No";
    }
}
