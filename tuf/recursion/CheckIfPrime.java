package tuf.recursion;

public class CheckIfPrime {
    public static void main(String[] args) {
        System.out.println(cifp(1));
    }

    
    static boolean cifp(int n) {
        // ! 0 and 1 are not prime numbers
        if (n<=1) {
            return false;
        }
       return checkPrime(n, 2);
       
    }

    static boolean checkPrime(int n, int i){
        if (i*i >(n)) {
            return true;
        }

        if (n % i == 0) {
            return false;
        }

        return checkPrime(n, i + 1);
    }
}
