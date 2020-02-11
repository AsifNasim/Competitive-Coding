import java.util.Scanner;

public class Ques_15_Series {
    /* 3n +2 series*/
    static Scanner s = new Scanner(System.in);
    private static void series(int N1, int N2){
        int n =1;
        int count = 1;
        while ( count <= N1){
            if(((3*n)+2)%N2 != 0){
                System.out.print(((3*n)+2)+" ");
                count++;
            }
            n++;
        }
    }

    public static void main(String[] args) {
        int N1 = s.nextInt();
        int N2 = s.nextInt();
        series(N1, N2);
    }
}
