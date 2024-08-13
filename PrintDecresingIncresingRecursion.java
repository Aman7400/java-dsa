public class PrintDecresingIncresingRecursion {
    public static void main(String[] args) {
        pdi(5);
    }
    public static void pdi(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n); // runs before going into stack 
        pdi(n-1);
        System.out.println(n);  // runs after coming from stack 
    }
}


// https://youtu.be/BWr4zBiRtJY?si=EU46SuM8eDx-l3Ld
