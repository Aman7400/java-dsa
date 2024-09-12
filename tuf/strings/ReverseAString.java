package tuf.strings;

import java.util.Vector;

// ? Time Complexity - O(n/2) -> since we are traversing only half of the [];
// * Another Approach - O(n) -> Create a Stack and push values into it, if you pop out you get reversed string (LIFO)

public class ReverseAString {
    public static void main(String[] args) {

        Vector<Character> s = new Vector<>();
        s.add('a');
        s.add('m');
        s.add('a');
        s.add('n');

        ras(s);
        
    }

   static void ras(Vector<Character> s){
        int l = 0;
        int r = s.size() - 1;

        while (l<r) {
            char temp = s.get(l);
            s.set(l, s.get(r));
            s.set(r,temp);
            l++;
            r--;
        }


        System.out.println(s);

   }
}
