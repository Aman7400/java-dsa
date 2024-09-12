package tuf.strings;

import java.util.Arrays;

// ? Sorting O(nlogn) + Character Matching O(m) where m is length of the shortest string of First and Last
// ? Overall Time Complexity : O(nlogn) + O(m)
// ? Space Complexity : O(m);

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(lcp(new String[]{"flowers", "flow", "float", "fly"}));
    }
    static String lcp(String arr[]){
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[arr.length - 1];

        String res = "";
        
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i)!= last.charAt(i)) {
                break;
            }
            res += first.charAt(i);
        }

        return res;

    }
}
