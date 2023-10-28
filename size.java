import java.util.ArrayList;

public class size {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add elements in the list
        list.add(2); // O(1)
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(9);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
