import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(8);
        list.add(9);
        list.add(91);
        list.add(98);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list.remove(0));

        System.out.println(list);

    }
}
