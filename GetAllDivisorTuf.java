import java.util.ArrayList;
import java.util.Collections;

public class GetAllDivisorTuf {

    public static void main(String[] args) {
        printArray(gad(6));
    }

    static void printArray(int[] intArray) {
        System.out.print("int array: ");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
    }

    public static int[] gad(int n) {
        ArrayList<Integer> divs = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divs.add(i);
                if (i != n / i) {  // Only add n / i if i is not the square root of n
                    divs.add(n / i);
                }
            }
        }

        Collections.sort(divs);

        int res[] = new int[divs.size()];

        // Convert ArrayList to int[]
        for (int i = 0; i < divs.size(); i++) {
            res[i] = divs.get(i);
        }

        return res;
    }
}