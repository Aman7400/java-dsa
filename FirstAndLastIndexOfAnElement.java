import java.util.Scanner;

public class FirstAndLastIndexOfAnElement {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int num = sc.nextInt();

            int l = 0;
            int h = arr.length - 1;
            int fIndex = -1;

            while (l <= h) {
                int mid = (l + h) / 2;
                if (num > arr[mid]) {
                    l = mid + 1;
                } else if (num < arr[mid]) {
                    h = mid - 1;
                } else {
                    fIndex = mid;
                    h = mid - 1;
                }
            }

            int low = 0;
            int high = arr.length - 1;
            int lIndex = -1;

            while (low <= high) {
                int mid = (low + high) / 2;
                if (num > arr[mid]) {
                    low = mid + 1;
                } else if (num < arr[mid]) {
                    high = mid - 1;
                } else {
                    lIndex = mid;
                    low = mid + 1;
                }
            }

            System.out.println(fIndex + "\t" + lIndex);

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
