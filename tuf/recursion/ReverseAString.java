package tuf.recursion;

import java.util.Vector;

public class ReverseAString {
    public static void main(String[] args) {
        Vector<Character> str = new Vector<>();
        str.add('a');
        str.add('m');
        str.add('a');
        str.add('n');
        System.out.println(ras(str));
    }

    static Vector<Character> ras(Vector<Character> s) {
        reverse( s, 0, s.size() - 1);
        return s;
    }

    static void reverse(Vector<Character> s, int left, int right) {
        if (left >= right){
            return;
        }

        char temp = s.get(left);
        s.set(left, s.get(right));
        s.set(right, temp);

        reverse(s, left+1, right-1);
    }
}
