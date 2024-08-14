package recursion;
/**
 * PowerLinearRecursion
 * https://youtu.be/KYke5cn9jAk?si=qRqJ5f1Q1rW6AiOD
 * Complexity - (N)
 */
public class PowerLinearRecursion {
    public static void main(String[] args) {
        System.out.println(plr(2,10));
    }

    static int plr(int x, int n) {

        if (n == 1) {
            return x;
        }
        int plrn = (x) * plr(x, n-1);
        return plrn;
    }

}