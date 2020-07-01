import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringSort {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            String str = s.next();
            list.add(str);
        }

        Collections.sort(list);
        for (String str: list) {
            System.out.println(str);
        }
    }
}
