package tuf.arrays;

//? Time Complexity - O[n];
public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        // System.out.println(mco(new int[] { 1, 1, 0, 0, 1, 1, 1, 0 }));
        System.out.println(mco(new int[] { 0, 0, 0 }));
    }

    static int mco(int arr[]) {
        int maxConq = 0;
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                counter += 1;
                maxConq = Math.max(maxConq, counter);
            } else {
                counter = 0;
            }
        }

        return maxConq;
    }
}
