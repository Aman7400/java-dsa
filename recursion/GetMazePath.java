package recursion;

import java.util.ArrayList;

// https://youtu.be/7i41gZLXe5k?si=9FoqT65Oi-crJ0I-

public class GetMazePath {
    public static void main(String[] args) {
        // Consider a matrix of 3*3 -> src(1,1) destination(3,3)
        System.out.println(gmp(1, 1, 3, 3));
    }

    /*
     * sr - source row
     * sc - source column
     * dr - destination row
     * dc - destination column
     */
    static ArrayList<String> gmp(int sr, int sc, int dr, int dc) {

        if (sr == dr && sc == dc) {
            ArrayList<String> fDes = new ArrayList<>();
            fDes.add("");
            return fDes;
        }

        ArrayList<String> pwsh = new ArrayList<>();
        ArrayList<String> pwsv = new ArrayList<>();

        if (sc < dc) {
            pwsh = gmp(sr, sc + 1, dr, dc);
        }
        if (sr < dr) {
            pwsv = gmp(sr + 1, sc, dr, dc);
        }

        ArrayList<String> allPaths = new ArrayList<>();

        for (String s : pwsh) {
            allPaths.add("h" + s);
        }
        for (String s : pwsv) {
            allPaths.add("v" + s);
        }

        return allPaths;
    }
}
