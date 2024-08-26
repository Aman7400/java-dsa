package recursion;

import java.util.ArrayList;

public class GetKeyPadCombination {
    public static void main(String[] args) {
        getKPC("6");
    }

    static String[] CODES = { ".?", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    static ArrayList<String> getKPC(String str) {

        if (str.length() == 0) {
            ArrayList<String> bRes = new ArrayList<>();
            bRes.add("");
            return bRes;
        }

        char ch = str.charAt(0);
        System.out.println(ch);
        String ros = str.substring(1);

        ArrayList<String> cRos = getKPC(ros);

        ArrayList<String> mRes = new ArrayList<>();
        String code = CODES[(int)ch];

        for (int i = 0; i < code.length(); i++) {
            for (String s : cRos) {
                mRes.add(code.charAt(i) + s);
            }
        }
        return mRes;
    }
}
