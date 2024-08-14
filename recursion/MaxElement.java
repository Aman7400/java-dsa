package recursion;

public class MaxElement {
    public static void main(String[] args) {
        System.out.println(findMax(new int[] {3,32,231,23423}, 0));
    }
    static int findMax(int arr[], int i) {
        int max =  arr[0];
        if (i == arr.length) {
            return max;
        }
        if (max > arr[i]) {
            max = arr[i];
        }
        findMax(arr, i+1);
        return max;
    }
}
