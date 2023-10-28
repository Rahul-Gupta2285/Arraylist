import java.util.ArrayList;

public class operations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add elements in the list
        list.add(2); // O(1)
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(9);

        list.add(0, 6); // another way to add element in the list o(N)

        System.out.println(list);

        // get operation
        System.out.println(list.get(4)); // O(1)

        // delete
        list.remove(2);

        System.out.println(list);

        // set operation

        list.set(2, 12);

        System.out.println(list);

        // contain operation

        System.out.println(list.contains(4));

    }
}
