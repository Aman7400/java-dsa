package recursion;

import java.util.ArrayList;

// ? https://youtu.be/Sa5PmCFF_zI?si=2FIUmfvCic7Gk8cI

public class SubSequence {
    public static void main(String[] args) {
        System.out.println(ss("abc"));
    }

    static ArrayList<String> ss(String str) {
        // ! Base Case
        if (str.length() == 0) {
            ArrayList<String> bRes = new ArrayList<>();
            bRes.add("");
            return bRes;
        }

        // ? Expectation:  ss("bc") => [--, -c, b-, bc]
        // ? Result:  ss("abc") => [---, --c, -b-, -bc, a--, a-c, ab-, abc]

        char ch = str.charAt(0); // get first char
        String ros = str.substring(1); 

        ArrayList<String> sros = ss(ros); // get Subsequence of rest of string

        ArrayList<String> mRes = new ArrayList<>(); // add the first character to get final answer
         for (String s : sros) {
            mRes.add("-" + s);
         }
         for (String s : sros) {
            mRes.add(ch + s);
         }

         return mRes;

    }
}
