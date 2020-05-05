import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class PrateekLovesCandy {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        boolean [] list =new boolean[1000001];
        list[0] = true;
        list[1] = true;

        for (int i = 2; i*i < list.length ; i++) {
            if(!list[i]){
                for (int j =i*i; j < list.length; j= j+i){
                    list[j] = true;
                }
            }
        }

        ArrayList<Integer> prime = new ArrayList<>();
        for (int i = 0; i <1000001 ; i++) {
            if(!list[i]){
                prime.add(i);
            }
        }
        for (int i = 0; i < n; i++) {
            int n1 = s.nextInt();
            System.out.println(prime.get(n1-1));
        }

    }
}
