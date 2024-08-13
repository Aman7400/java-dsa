public class CharAsciiDiffernce {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abcdefac");
        StringBuilder ans = new StringBuilder();
        ans.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);

            int diff = (int) curr - (int) prev;
            ans.append(diff);
            ans.append(curr);

        }
        System.out.println(ans);
    }
}
