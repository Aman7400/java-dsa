package tuf.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public static void main(String[] args) {
        System.out.println(tso(new int[] { 2, -2, 0, 3, -3, 5 }));
    }

    // ! Brute
    // ? T.C -> O(N3 x log(no. of unique triplets))
    // ? S.C -> 2*O[no. of unique triplets] -> for using a set data structure and a
    // list to store the triplets.
    static List<List<Integer>> ts(int arr[]) {
        // Create a set
        Set<List<Integer>> tripleSets = new HashSet<>();
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                        Collections.sort(list);
                        tripleSets.add(list);
                    }
                }
            }
        }

        List<List<Integer>> res = new ArrayList<>(tripleSets);
        return res;
    }

    // ! Better - Pending, involves Hasing 


    // ! Optimal
    // ? T.C - O[n2] + O[nlogn] (sorting)
    // ? S.C - O[1]
    static List<List<Integer>> tso(int arr[]) {
        List<List<Integer>> tripleSets = new ArrayList<>();
        // Sort the arr;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = arr.length - 1;

            while (j < k) {
                if (arr[i] + arr[j] + arr[k] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(arr[k]);
                    tripleSets.add(list);

                    j++;
                    k--;
                    
                    while (j < k && arr[j] == arr[j - 1]) {
                        j++;
                    }
                    while (j < k && arr[k] == arr[k + 1]) {
                        k--;
                    }
                } else if (arr[i] + arr[j] + arr[k] < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return tripleSets;
    }
}
