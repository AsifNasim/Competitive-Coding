import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class PrateekLovesCandy {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i < list.size(); i++){
            int x = s.nextInt();
            list.add(x);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
