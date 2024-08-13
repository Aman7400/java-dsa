import java.util.ArrayList;

public class RemovePrimeFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(11);
        arr.add(23);
        arr.add(34);
        arr.add(42);
        arr.add(59);
        removePrime(arr);
        System.out.println(arr);
    }

    public static boolean isPrime(int number) {
        // Handle edge cases
        // if (number <= 1) {
        //     return false;
        // }
        
        // Check for divisibility up to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void removePrime(ArrayList<Integer> arr) {
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (isPrime(arr.get(i))) {
                arr.remove(i);
            }
        }
    }

}
