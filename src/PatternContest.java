import java.util.Scanner;

public class PatternContest {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int [] ans = unevenSeries(n);
        for (int i = 0; i <ans.length ; i++) {
            System.out.println(ans[i]);
        }
        }

    private static int[] unevenSeries(int n) {
        int i =0;
        int j = n-1;
        int num = n;
        int [] arr = new int[n];
        while (i < j){
            if(n%2!= 0) {
                arr[i] = num;
                num--;
                i++;
                arr[j] = num;
                num--;
                j--;
            }
            else {
                arr[j] = num;
                num--;
                j--;
                arr[i] = num;
                num--;
                i++;
            }
        }
        if(i == j){
            arr[i] = num;
        }
        return arr;
    }

}
