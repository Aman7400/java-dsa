package tuf.arrays;


import java.util.ArrayList;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int arr1[] = new int[] { 1, 2, 3, 4, 5 };
        int arr2[] = new int[] { 1, 2, 7 };

        int res[] = uota(arr1, arr2);

        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    // ! Optimal
    // ? Time Complexity: O(M+N)
    // ?Space Complexity: O(1)

    static int[] uota(int arr1[], int arr2[]) {
        ArrayList<Integer> union = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }

                i++;
            } else {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                j++;
            }
        }
        for (; i < arr1.length; i++) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }

        }
        for (; j < arr2.length; j++) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
        }

        // Convert List<Integer> to int[]
        int res[] = new int[union.size()];
        for (int k = 0; k < res.length; k++) {
            res[k] = union.get(k);
        }

        return res;
    }
}
