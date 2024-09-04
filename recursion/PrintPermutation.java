package recursion;

// https://youtu.be/sPAT_DbvDj0?si=7rIzvgKp6apJTWMw

public class PrintPermutation {
    public static void main(String[] args) {
        pp("abcd","");
    }

    static void pp(String ques, String asf){

        if (ques.length() == 0) {
            System.out.println(asf);
            return;
        }

        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String lside = ques.substring(0, i);
            String rside = ques.substring(i+1);
            pp(lside+rside, asf+ch);
        }
    }
}
