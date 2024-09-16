package tuf.recursion;

public class SumOfArrayElements {
    public static void main(String[] args) {
        System.out.println(soae(new int[] { 1, 3, 4, 5 }, 0));
    }

    static int soae(int arr[], int i) {
        if (i >= arr.length) {
            return 0;
        }
        return arr[i] + soae(arr, i + 1);
    }

}