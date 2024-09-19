package tuf.arrays;

import java.util.ArrayList;

//! Revisit
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int res[] = iota(new int[] { 1, 2, 2, 3, 5 }, new int[] { 1, 2, 7 });
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    static int[] iota(int num1[], int num2[]) {

        ArrayList<Integer> intersection = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < num1.length && j < num2.length) {
            if (num1[i] == num2[j]) {
                if (intersection.isEmpty() || intersection.get(intersection.size() - 1) != num1[i]) {
                    intersection.add(num1[i]);
                }
                i++;
                j++;
            } else if (num1[i] < num2[j]) {
                i++; // Increment i to move through num1
            } else {
                j++; // Increment j to move through num2
            }
        }

        // Convert List<Integer> to int[]
        int res[] = new int[intersection.size()];
        for (int k = 0; k < res.length; k++) {
            res[k] = intersection.get(k);
        }
        return res;
    }
}
