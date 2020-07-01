import java.util.Scanner;

public class QueensCombination {
    static Scanner s = new Scanner(System.in);
    static int count = 0;
    public static void main(String[] args) {
      boolean [] boxes;
      queensCombination(new boolean[4], 0, 2,"", -1);
    }

    private static void queensCombination(boolean[] boxes, int qpsf, int tq, String ans, int lastBox) {
        if( qpsf == tq){
            count++;
            System.out.println(count+". "+ans);
            return;
        }

        for (int i = lastBox+1; i < boxes.length; i++) {
            boxes[i] = true;
            queensCombination(boxes, qpsf+1,tq,ans+"q"+qpsf+"b"+i+" ",i);
            boxes[i] = false;
        }
    }
}
