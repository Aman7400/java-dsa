import java.util.Scanner;

public class SubsetofAnArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            // to be a subset either you are 0 or 1, so it becomes a pattern of binary
            // numbers
            // No of subsets for an array of size n = 2^n
            // print binary from i = 0 to nSubsets;
            // each binary bit represents an element from the array

            int limit = (int) Math.pow(2, arr.length);
            for (int i = 0; i < limit; i++) {
                // Convert to binary
                int temp = i;
                String res = "";
                // No of bits required = arr.length
                // If we go with j++, we would be adding _ba before so
                // we reverse the loop, to get ab_
                for (int j = arr.length - 1; j >= 0; j--) {

                    int rem = temp % 2;
                    temp = temp / 2;

                    if (rem == 0) {
                        res = "-\t" + res;
                    } else {
                        res = arr[j] + "\t" + res;
                    }
                    System.out.println(res);
                }
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
