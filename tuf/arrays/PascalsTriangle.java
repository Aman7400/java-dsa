package tuf.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(pt(4));
    }

    // ! Optimal Approach
    // ? Time Complexity: O(N2)
    // ? S.C: O[1] -> NO extra space but for storing ans O[n^2]
    static List<List<Integer>> pt(int nRow) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i <= nRow; i++) {
            ans.add(generateRows(i));
        }
        return ans;
    }

    static List<Integer> generateRows(int row) {
        long ans = 1;

        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);

        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add((int) ans);
        }

        return ansRow;

    }

}
