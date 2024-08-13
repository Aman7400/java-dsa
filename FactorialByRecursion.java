public class FactorialByRecursion {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        int fn = n * fact(n - 1);
       return fn;
    }
}
