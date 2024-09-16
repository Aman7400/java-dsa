package tuf.recursion;

public class SumOfDigitsInANumber {
    public static void main(String[] args) {
        System.out.println(sodian(5291));
    }
    static int sodian(int num){

        if(num < 10) return num;
        int sum = 0;
        while(num > 0){
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sodian(sum);

    }
}
