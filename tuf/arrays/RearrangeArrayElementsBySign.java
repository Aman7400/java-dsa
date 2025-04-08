package tuf.arrays;

import java.util.ArrayList;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int res[] = raeso(new int[] { 2, 4, 5, -1, -3, -4 });
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    // ! Optimal
    // ? Time Complexity: O(N)
    // ?Space Complexity: O(N) to store the resultant array.
    static int[] raeso(int arr[]) {
        int res[] = new int[arr.length];

        int pIndex = 0;
        int nIndex = 1;

        for (int i = 0; i < res.length; i++) {
            if (arr[i] < 0) {
                res[nIndex] = arr[i];
                nIndex += 2;
            } else {
                res[pIndex] = arr[i];
                pIndex += 2;
            }
        }

        return res;
    }

    // ! Brute
    // ? Time Complexity: O(N+N/2), O(N) for traversing the array once for
    // ? segregating positives and negatives and another O(N/2) for adding those
    // ? elements alternatively to the array.
    // ? Space Complexity: O(N/2 + N/2) = O(N), N/2 space required to store each of
    // ? the positive and negative elements in separate arrays.
    static int[] raes(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }

        for (int i = 0, j = 0; i < n && j < n / 2; i += 2, j++) {
            arr[i] = pos.get(j);
            arr[i + 1] = neg.get(j);
        }
        return arr;
    }
}
