package tuf.arrays;
import java.util.HashSet;

// ! Return the number of unique elements in the array.
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int arr[] = new int[] { 0, 0, 3, 3, 5, 6 };
        System.out.println(rde(arr));
    }

    static int rde(int arr[]) {

        HashSet<Integer> list = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int j = 0;

        for (Integer integer : list) {
            arr[j++] = integer;
        }

        return list.size();
    }

    // ! Optimal
    // ? Time Complexity: O(N)
    // ? Space Complexity: O(1)

    static int rdeo(int arr[]) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return (i + 1);
    }
}
