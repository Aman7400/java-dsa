package tuf.strings;

public class LargestOddNumberInAString {
    public static void main(String[] args) {
       System.out.println(glonias("0214638"));
    }

    static String glonias(String s){

        // Traverse all Substrings
        // int max = Integer.MIN_VALUE;
        // for (int i = 0; i < s.length(); i++) {
        //     for (int j = i+1; j <= s.length(); j++) {
        //         int substr = Integer.parseInt(s.substring(i, j));
        //         // System.out.println(substr);
        //         if (substr % 2 != 0) {
        //             max = Math.max(max, substr);
        //         }
        //     }
        // }

        // return max+"";


        // ? Approach 2 
        // * find first odd digit from right
        int j = -1; int n = s.length();
        for (int i = n-1; i >= 0; i--) {
            if ((s.charAt(i) - '0') % 2 != 0) {
                j = i;
                break;
            }
        }

        // * if j=-1; that means no odd digit so return "";
        if (j==-1) {
            return "";
        }

        // Find First Non Zero digit from Start
        int i = 0;
        while (i<n) {
            if (s.charAt(i) != '0') {
                break;
            }
            i+=1;
        }

        return s.substring(i, j+1);

    }
}
