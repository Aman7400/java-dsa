package recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {

        toh(5, 'A', 'B', 'C');
        
    }
    static void toh(int n, char t1id, char t2id, char t3id) {
        if (n == 0) {
            return;
        }
        toh(n-1, t1id, t3id, t2id);
        System.out.println(n + "[ " + t1id + "->" +  t2id +  " ]");
        toh(n-1, t3id, t2id, t1id);
    }
}
