package tuf.hashing;

public class SecondHighestOccuringElement {
    public static void main(String[] args) {
        // System.out.println(gshoe(new int[] { 1, 4, 5, 6, 4, 6, 5, 5, 6,4 }, 10));
        // System.out.println(gshoe(new int[] { 4, 4, 5, 5, 6, 7 }, 6));
        System.out.println(gshoe(new int[] { 1, 2, 2, 3, 3, 3 }, 6));
    }

    // ? Just keep an extra variable to swap when you find highest occuring
    static int gshoe(int arr[], int n) {

        // find max
        int max = 0;
        for (int i = 0; i < n - 1; i++) {
            max = Math.max(max, arr[i]);
        }

        // compute hash[]
        int hash[] = new int[max + 1];

        for (int i = 0; i < n - 1; i++) {
            hash[arr[i]]++;
        }

        // traverse hash[]
        int ele1 = -1;
        int ele2 = -1;
        int maxFreq1 = 0;
        int maxFreq2 = 0;

        // when you update maxFreq1 (highest occuring), move its value to maxFreq2 (2nd
        // highest occuring)
        for (int i = 0; i < max + 1; i++) {
            if (hash[i] > maxFreq1) {
                ele2 = ele1;
                maxFreq2 = maxFreq1;
                maxFreq1 = hash[i];
                ele1 = i;
            }
            else if (hash[i] == maxFreq1) {
               ele1 = Math.min(ele1, i);
            }
            else if (hash[i] > maxFreq2) {
                ele2 = i;
                maxFreq2 = hash[i];
            } else if (hash[i] == maxFreq2) {
                ele2 = Math.min(ele2, i);
            }
        }

        return ele2;

    }
}
