import java.util.Scanner;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            String str = sc.nextLine();

            // Substrings
            for (int i = 0; i < str.length(); i++) {
                for (int j = i+1; j <= str.length(); j++) {
                    if (isPlaindrome(str.substring(i,j))) {
                        System.out.println(str.substring(i,j));
                    }
                }
            }

            
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static boolean isPlaindrome(String s){

        int i = 0;
        int j = s.length() - 1;

        while (i<=j) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);

            if (c1 != c2) {
                return false;
            } else {
                i++;
                j--;
            }
        }

        return true;

    }

}
