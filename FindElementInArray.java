import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();

            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int eleToFind = sc.nextInt();

            int pos = -1;

            for (int i = 0; i < arr.length; i++) {
                if (eleToFind == arr[i]) {
                    pos = i;
                    break;
                }
            }

            System.out.println(pos);

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
