package tuf.arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        // System.out.println(fmn(new int[] { 0, 1, 2, 4, 5, 6 }));
        System.out.println(fmno1(new int[] { 0, 1, 2, 4, 5, 6 }));
    }

    // ! Optimal 1
    // ? Time complexity : O[n]
    // ? Space Complexity: O[1]

    static int fmno1(int arr[]) {
        int n = arr.length;
        int sum = (n * (n + 1) / 2);

        int mSum = 0;
        for (int i = 0; i < arr.length; i++) {
            mSum += arr[i];
        }
        return sum - mSum;
    }

    // ! Optimal 2 - Something involving XOR of two numbers we need to check back later

    // ! Better
    // ? Time complexity : O[n] + O[n] -> O[2n]
    // ? Space Complexity: O[n] -> since we need to hash all elements;
    static int fmn(int arr[]) {

        // For this range check missing number
        int mn = -1;
        int hash[] = new int[arr.length + 1];
        for (int i : arr) {
            hash[i]++;
        }

        for (int i = 0; i < hash.length; i++) {
            if (hash[i] == 0) {
                mn = i;
            }
        }

        return mn;

    }
}
