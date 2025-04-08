package tuf.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement1 {
    public static void main(String[] args) {
        System.out.println(getMajorityElement(new int[] { 7, 0, 0, 1, 7, 7, 2, 7, 7 }));
    }

    // ! Better
    // Time Complexity: O(NxlogN) + O(N)
    // Space Complexity: O(N) for using a map data structure.

    static int getMajorityElement(int arr[]) {
        Map<Integer, Integer> freqHash = new HashMap<>();

        for (int num : arr) {
            freqHash.put(num, freqHash.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freqHash.entrySet()) {
            if (entry.getValue() > arr.length / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }

    // ! Optimal
    // T.C -> O(N) + O(N)
    // S.C -> O(1) -> since no extra space used

    static int getMajorityElementOptimal(int arr[]) {
        int count = 0;
        int el = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                count += 1;
                el = arr[i];
            } else if (el == arr[i]) {
                count++;
            } else {
                count--;
            }
        }

        return el;

        // ? - If the problem doesnt clearly say that array has a majority element, then
        // only do this.
        // int frq = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == el) {
        // frq+=1;
        // }
        // }

        // if (frq > arr.length / 2) {
        // return el;
        // }
        // return -1;
    }

}
