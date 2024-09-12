package tuf.strings;


// ? Time Complexity - O(n/2) -> since we are traversing only half of the [];


public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(pc("naman"));
    }

    static boolean pc(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left< right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
