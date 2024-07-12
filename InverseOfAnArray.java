import java.util.Scanner;

public class InverseOfAnArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int inv[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                int val = arr[i];
                inv[val] = i;
            }

            for (int i = 0; i < inv.length; i++) {
                System.out.print(inv[i] + "\t");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
