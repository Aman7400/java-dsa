package tuf.recursion;

public class CheckPalindromeString {
    public static void main(String[] args) {
        System.out.println(ps("naman"));
    }

    static boolean ps(String s) {
        char str[] = s.toCharArray();
        reverse(str, 0, str.length -1);

       System.out.println(new String(str));
       
        return s.equals(new String(str));
    }
     static void reverse(char arr[], int left, int right){

        if (left >= right) {
            return;
        }
        
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverse(arr, left+1, right-1);
        
     }
}
