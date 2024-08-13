public class RoughWork {
    public static void main(String[] args) {

        recursive(5);
        
    }
    
    public static void recursive(int n){
        if (n == 0) {
            return;
        }
        System.out.println(n);
        recursive(n-1);
    }
}
