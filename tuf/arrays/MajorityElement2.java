package tuf.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {
    public static void main(String[] args) {
        System.out.println(majorityElementTwo(new int[] { 1, 2, 1, 1, 3, 2, 2, 3 }));
    }

    public static List<Integer> majorityElementTwo(int[] arr) {
        List<Integer> res = new ArrayList<>();

        // Find Hash
        Map<Integer, Integer> freqHash = new HashMap<>();

        for (int num : arr) {
            freqHash.put(num, freqHash.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freqHash.entrySet()) {
            if (entry.getValue() > arr.length / 3) {
                res.add(entry.getKey());
            }
        }

        return res;
    }

}
