package recursion;

// https://youtu.be/bQkwHBaNioE?si=3oED2tUvhLSKgYp4
public class AllOccurence {
    public static void main(String[] args) {
        int res[] = ao(new int[] { 1, 2, 4, 3, 4, 5, 6, 4 }, 0, 4, 0);
        for (int i : res) {
            System.out.print(i+" ");
        }
        
    }

    static int[] ao(int arr[], int idx, int x, int fsf) {

        if (idx == arr.length) {
            return new int[fsf];
        }

        if (arr[idx] == x) {
            int[] res = ao(arr, idx + 1, x, fsf + 1);
            res[fsf] = idx;
            return res;
        } else {
            int[] res = ao(arr, idx + 1, x, fsf);
            return res;
        }

    }
}
