package leetcode;

public class StudentAttendanceRecord1 {
    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLL"));
    }
    static boolean checkRecord(String s) {
        int abc = 0;
        int lCounter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                abc++;
                if (abc >=2) {
                    return false;
                }
            }
            if (s.charAt(i) == 'L') {
                lCounter++;
                if (lCounter >= 3) {
                    return false;
                }
            } else {
                lCounter = 0;
            }
        }

        return true;
    }
}
