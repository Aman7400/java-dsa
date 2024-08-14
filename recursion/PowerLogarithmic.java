package recursion;

/**
 * https://youtu.be/O84uumjBOMY?si=ZCK4MWZ6fZVzND_0
 * Complexity - log(N)
 */

public class PowerLogarithmic {
    public static void main(String[] args) {
        System.out.println(pl(2, 10));
    }
    static long pl(long x, int n) {
        if (n == 0) {
            return 1;
        }
        long xpn2 = pl(x, n/2);
        long xpn = xpn2 * xpn2;
        if (n%2 == 1) {
            xpn = xpn * x;
        }
        return xpn;
    }
}
