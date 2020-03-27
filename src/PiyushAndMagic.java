import java.util.Scanner;

public class PiyushAndMagic {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int s = sc.nextInt();
        char  [][] arr = new char[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }
        piyush(arr,k,s);
    }

    private static void piyush(char [][] arr, int k, int s) {
        int S = s;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == '.' ){
                S= S-2;
                }
                if(arr[i][j] == '*'){
                    S = S+5;
                }
                if(arr[i][j] == '#'){
                    break;
                }
                if(j != arr[i].length-1){
                    S--;
                }
            }
            if(S<k){
                break;
            }
        }
        if(S > k){
            System.out.println("Yes");
            System.out.println(S);
        }
        else{
            System.out.println("No");
        }
    }
}
