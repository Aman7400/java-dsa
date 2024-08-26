package recursion;
// https://youtu.be/xttMLI4Kb3k?si=Bif4IYz1YiEGZdYn

public class LastOccurence {
    public static void main(String[] args) {
        System.out.println(lo( new int[] {2,34,5,65,76,5,67}, 0, 34 ));
    }
    static int lo(int arr[], int idx, int x) {
        if (idx == arr.length) {
            return -1;
        }

        int liisa = lo(arr, idx+1, x);
        if (liisa == -1) {
            if (arr[idx] == x) {
                return idx;
            } else {
                return -1;
            }
            
        } else {
            return liisa;
        }

    }
}
