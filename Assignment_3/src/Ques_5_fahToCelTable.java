import java.util.Scanner;

public class Ques_5_fahToCelTable {
    static Scanner s = new Scanner(System.in);
    private static void fahTocel(int start, int end, int step){
        float cel =0;
        while (start <= end ){
            cel = (float)(((start -32)*5)/9);
            System.out.println(start+"   "+cel);
            start = start + step;
        }

    }

    public static void main(String[] args) {
        int start = s.nextInt();
        int end = s.nextInt();
        int step = s.nextInt();
        fahTocel(start,end,step);
    }
}
