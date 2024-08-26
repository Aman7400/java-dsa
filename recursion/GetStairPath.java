package recursion;

import java.util.ArrayList;

// https://youtu.be/hMJAlbJIS7E?si=Kid8So0sVz2pIsxy
class GetStairPath {
    public static void main(String[] args) {
        System.out.println(gStairPath(3));
    }
    static ArrayList<String> gStairPath(int n) {

        if (n == 0) {
            ArrayList<String> bres = new ArrayList<>(); // ! Positive Base Case: if you already at ground floor, only path left is doing nothing -> ""
            bres.add("");
            return bres;
        } else if (n < 0) {
            ArrayList<String> nres = new ArrayList<>(); // ! Negative Base Case: if you below ground floor, you can't take any step
            return nres;
        }

        // For a given stair n - you can take 1, 2 or 3 steps jump
        // Path for (n,0) = 1+(n-1,0) + 2+(n-2,0) + 3+(n-3,0)

        ArrayList<String> paths1 = gStairPath(n-1);
        ArrayList<String> paths2 = gStairPath(n-2);
        ArrayList<String> paths3 = gStairPath(n-3);

        ArrayList<String> paths = new ArrayList<>();

        for (String path : paths1) {
            paths.add(1+path);
        }
        for (String path : paths2) {
            paths.add(2+path);
        }
        for (String path : paths3) {
            paths.add(3+path);
        }

        return paths;
    }
    
}