import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int i = 0;
            int j = arr.length - 1;

            while (i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }

            for (int j2 = 0; j2 < arr.length; j2++) {
                System.out.print(arr[j2] + "\t");
            }




        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
