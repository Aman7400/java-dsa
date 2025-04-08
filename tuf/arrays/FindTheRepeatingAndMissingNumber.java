package tuf.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindTheRepeatingAndMissingNumber {
    public static void main(String[] args) {

        int res[] = findMissingRepeatingNumbersOptimal1(new int[] { 3, 5, 4, 1, 1 });
        for (int i : res) {
            System.out.print(i + " ");
        }

    }

    // ! Better
    // Time Complexity: O(2*N)
    // Space Complexity: O(N) for using a hash array.

    public static int[] findMissingRepeatingNumbers(int[] nums) {

        Map<Integer, Integer> freqHash = new HashMap<>();

        for (int num : nums) {
            freqHash.put(num, freqHash.getOrDefault(num, 0) + 1);
        }

        int dup = 0;
        int missing = 0;

        for (int i = 1; i <= nums.length; i++) {
            if (!freqHash.containsKey(i)) {
                missing = i;
            } else if (freqHash.get(i) == 2) {
                dup = i;
            }
        }

        return new int[] { dup, missing };
    }

    public static int[] findMissingRepeatingNumbersOptimal1(int[] nums) {

        // S - Sn -> X - Y
        // S2 - S2n -> X^2 - Y^2

        int n = nums.length;

        long sn = (n * (n + 1)) / 2;
        long s2n = (n * (n + 1) * (2 * n + 1)) / 6;

        long s = 0;
        long s2 = 0;

        for (int i = 0; i < nums.length; i++) {
            s += nums[i];
            s2 += nums[i] * nums[i];
        }

        long val1 = s - sn;
        long val2 = s2 - s2n;
        val2 = val2 / val1; // get X+Y

        long x = (val1 + val2) / 2;
        long y = x - val1;

        return new int[] { (int) x, (int) y };

    }
}
