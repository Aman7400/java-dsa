import java.util.Scanner;

public class CountNoOfDigits {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int counter = (int) (Math.log10(n)) + 1; 
            System.out.println(counter);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// ! Optimal Solution