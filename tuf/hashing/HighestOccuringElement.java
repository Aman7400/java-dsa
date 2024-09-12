package tuf.hashing;

// https://takeuforward.org/plus/data-structures-and-algorithm/beginner-problems/basic-hashing/highest-occurring-element-in-an-array

public class HighestOccuringElement {
    public static void main(String[] args) {
        // System.out.println(ghoe(new int[]{1,4,5,6,4,6,5,5,6},9 ));
        System.out.println(ghoe(new int[]{4, 4, 5, 5, 6, 7},6));
    }

    // ! Bruteforce Approach
    /*
     * itreate over array and keep a hashed array to store visited element count;
     * Time complexity: o(n*n)
     */

    // ? Optimal Appraoch
    /*
     * Create a Hashed Array by iterating once in pre computation
     *
     */


    static int ghoe(int arr[], int n) {

        // find max
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        // declare hash[max]
        int hash[] = new int[max+1];

        

        // Count Occurences
        for (int i = 0; i < n; i++) {
            hash[arr[i]] ++;
        }

        int maxCount = 0;
        int ele = -1;

        // Traverse Hash to find Highest Occruiring
        for (int i = 0; i < max + 1; i++) {
            if (hash[i] > maxCount) {
                maxCount = hash[i];
                ele = i;
            }
        }

        return ele;

    }
}
