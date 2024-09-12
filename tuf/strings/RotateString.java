package tuf.strings;

public class RotateString {
    public static void main(String[] args) {
    //    System.out.println(brs("abcde", "adeac"));
       System.out.println(ors("abcde", "adeac"));
    }
    // ! Brute Force
    // ? Time Complexity : O(n^2);
    // ? Space Complexity : O(n);
    static boolean brs(String s, String goal){
        String left = "";
        for (int i = 0; i < s.length() - 1; i++) {

            String right = s.substring(i);

            if (goal.equals(right+left)) {
                return true;
            }

            left += s.charAt(i);
            
        }
        return false;
    }

    // ! Optimal
    // ? Time Complexity : O(2n) + O(n);
    // ? Space Complexity : O(n);
    static boolean ors(String s, String goal) {
        String s2 = s+s;

        if (s2.contains(goal)) {
            return true;
        }

        return false;
    }

}
