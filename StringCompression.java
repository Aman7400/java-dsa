public class StringCompression {
    public static void main(String[] args) {

        System.out.println(compression1("aaabbccccddaeeef"));
        System.out.println(compression2("aaabbccccddaeeefff"));

    }

    // return abcdaef
    public static String compression1(String str) {
        String res = str.charAt(0) + "";

        for (int i = 1; i < str.length(); i++) {

            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);

            if (curr != prev) {
                res = res + curr;
            }
        }

        return res;
    }

    // return a3b2c4d2a1e3f2
    public static String compression2(String str) {
        String res = str.charAt(0) + "";
        int counter = 1;

        for (int i = 1; i < str.length(); i++) {

            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);

            if (curr == prev) {
                counter++;
            } else {
                if (counter > 1) {
                    res += counter;
                    counter = 1;
                }
                res += curr;
            }

        }
        // when counter is > 1 at the end of the loop, add it back to string ( handle the count of the last character )
        if (counter > 1) {
            res += counter;
            counter = 1;
        }

        return res;
    }
}
