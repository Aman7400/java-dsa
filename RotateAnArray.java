import java.util.Scanner;

public class RotateAnArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int k = sc.nextInt(); // no of place to rotate by
            k = k % n; // Rounding off rotations in multiple of size
            if (k < 0) {
                k = k + n;
            }

            // First Reverse part 1
            reverse(arr, 0, arr.length - k - 1);
            // Then Reverse part 2
            reverse(arr, arr.length - k, arr.length - 1);
            // Then Reverse whole
            reverse(arr, 0, arr.length - 1);

            for (int j2 = 0; j2 < arr.length; j2++) {
                System.out.print(arr[j2] + "\t");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void reverse(int arr[], int i, int j) {

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}
