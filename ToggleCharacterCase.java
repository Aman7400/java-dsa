public class ToggleCharacterCase {
    public static void main(String[] args) {
        // lowerCaseChar = 'a' + upperCaseChar - 'A';
        // upperCaseChar = 'A' + lowerCaseChar - 'a';
        StringBuilder str = new StringBuilder("ToggleCharacterCase");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                char uch = (char) ('A' + ch - 'a');
                str.setCharAt(i, uch);
            } else if ( ch >= 'A' && ch <= 'Z') {
                char lch = (char) ('a' + ch - 'A');
                str.setCharAt(i, lch);
            }
        }

        System.out.println(str.toString());

    }
}
