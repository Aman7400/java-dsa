package recursion;

import java.util.ArrayList;

// https://youtu.be/VaGBRiSdtFI?si=XDw-nD-Teajy7Eav

public class GetMazePathWithJumps {
    public static void main(String[] args) {
        System.out.println(gmpwj(1, 1, 3, 3));
    }

    static ArrayList<String> gmpwj(int sr, int sc, int dr, int dc) {

        if (sr == dr && sc == dc) {
            ArrayList<String> bRes = new ArrayList<>();
            bRes.add("");
            return bRes;
        }

        ArrayList<String> paths = new ArrayList<>();

        // Horizontal
        for (int i = 1; i <= dc - sc; i++) {
            ArrayList<String> hpaths = gmpwj(sr, sc + i, dr, dc);
            for (String path : hpaths) {
                paths.add("h" + i + path);
            }
        }
        // Vertical
        for (int i = 1; i <= dr - sr; i++) {
            ArrayList<String> vpaths = gmpwj(sr+i, sc, dr, dc);
            for (String path : vpaths) {
                paths.add("v" + i + path);
            }
        }
        // Diagonal
        for (int i = 1; i <= dc - sc && i <= dr - sr; i++) {
            ArrayList<String> dpaths = gmpwj(sr+i, sc+i, dr, dc);
            for (String path : dpaths) {
                paths.add("d" + i + path);
            }
        }

        return paths;
    }

}
