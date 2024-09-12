package tuf.hashing;

public class SumOfHighestAndLowestOccuringElement {
    public static void main(String[] args) {
        System.out.println(gsohnloe(new int[]{1,2,2,3,3,2}));
    }
    static int gsohnloe(int arr[]){

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }


        int hash[] = new int[max+1];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        // Iterate over has array 
        int maxFreq = 0;
        int minFreq = arr.length ;
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 0) { // Only consider non-zero frequencies
                maxFreq = Math.max(maxFreq, hash[i]);
                minFreq = Math.min(minFreq, hash[i]);
            }
        }

        return maxFreq + minFreq;
    }
}
