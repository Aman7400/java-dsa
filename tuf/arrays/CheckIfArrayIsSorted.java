package tuf.arrays;

public class CheckIfArrayIsSorted {

    public static void main(String[] args) {
        System.out.println(arraySortedOrNot(new int[] { 1, 2, 0, 4, 5 }, 5));
    }

    static boolean arraySortedOrNot(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }
        return true;
    }

}