import java.util.ArrayList;

public class ArrayListEg {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.size()); // get size
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list + "->" + list.size());
        // add an elememt at an index
        list.add(1,1000);
        System.out.println(list);
        // get an element
        System.out.println(list.get(3));
        // set a index
        list.set(0, 2000);
        System.out.println(list);
        // remove an element
        list.remove(1);
        System.out.println(list);


    }
}
