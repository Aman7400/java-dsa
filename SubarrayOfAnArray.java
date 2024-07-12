import java.util.Scanner;

public class SubarrayOfAnArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j < arr.length; j++) {
                    for (int j2 = i; j2 <= j; j2++) {
                        System.out.print(arr[j2] + "\t");
                    }
                    System.out.println();
                }
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
