package recursion;

public class PrintArray {
    public static void main(String[] args) {
        // pa(new int[] {1,3,4,5,6}, 0);
        par(new int[] {1,3,4,5,6}, 0);
    }
    static void pa(int arr[], int i){
        if (i == arr.length) {
            return;
        }
        System.out.println(arr[i]);
        pa(arr, i+1);
    }

    static void par(int arr[], int i) {
        if (i == arr.length) {
            return;
        }
        par(arr, i+1);
        System.out.println(arr[i]);
    }
}
