import java.util.Scanner;

public class CeilAndFloorOfAnElementInArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int data = sc.nextInt(); // no to find ceil and floor of
            int floor = 0;
            int ceil = 0;
            int low = 0;
            int high = arr.length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (data < arr[mid]) {
                    high = mid - 1;
                    ceil = arr[mid];
                } else if (data > arr[mid]) {
                    low = mid + 1;
                    floor = arr[mid];
                } else {
                    ceil = arr[mid];
                    floor = arr[mid];
                    break;
                }
            }
            System.out.println(floor + "\t" + ceil);
        } catch (Exception e) {
            System.err.println(e);
        }

    }
}
