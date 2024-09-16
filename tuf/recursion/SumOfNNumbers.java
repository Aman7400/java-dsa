package tuf.recursion;

public class SumOfNNumbers {
    public static void main(String[] args) {
        System.out.println(sonn(10));
    }

    static int sonn(int n){
        if (n == 1) return 1;
        int sum = n + sonn(n-1);
        return sum;
    }
}
