package tuf.strings;

import java.util.Arrays;

// ? Time Complexity: O(N log N) due to sorting each string.
// ? Space Complexity: O(1) as no additional data structures are used.

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(va("dog", "cat"));
    }


    static String sortString(String s){
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        return new String(ch) ;
    }

    static boolean va(String s, String t){
        return sortString(s).equals(sortString(t));
    }
    
}