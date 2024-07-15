import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();
            int arr[] = new int[n];

            // assuming array entered is sorted
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int numToSearch = sc.nextInt();

            int low = 0;
            int high = arr.length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;
                if (numToSearch > arr[mid]) {
                    low = mid + 1;
                } else if (numToSearch < arr[mid]) {
                    high = mid - 1;
                } else {
                    System.out.println(mid);
                    return;
                }
            }

            System.out.println(-1);

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
