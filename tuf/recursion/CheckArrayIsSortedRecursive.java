package tuf.recursion;

public class CheckArrayIsSortedRecursive {
    public static void main(String[] args) {
        System.out.println(caisr(new int[] { 1, 2, 3, 4, 5 }));
    }

    static boolean caisr(int arr[]) {
        return checkSorted(arr, 0, 1);
    }

    static boolean checkSorted(int arr[], int prev, int curr) {

        if (curr > arr.length - 1) {
            return true;
        }

        if (arr[prev] > arr[curr]) {
            return false;
        }

        return checkSorted(arr, prev+1, curr+1);

    }
}
