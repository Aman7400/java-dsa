package recursion;

public class FirstOccurence {
    public static void main(String[] args) {
        System.out.println(fo(new int[] { 12, 23, 5, 65, 3, 5, 0 }, 0, 2));
    }

    static int fo(int[] arr, int idx, int x) {
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == x) {
            return idx;
        } else {
            int fiisa = fo(arr, idx + 1, x);
            return fiisa;
        }
    }
}
