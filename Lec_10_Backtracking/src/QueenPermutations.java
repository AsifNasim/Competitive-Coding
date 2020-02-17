import java.util.Scanner;

public class QueenPermutations {
    static Scanner s = new Scanner(System.in);
    static int count = 0;
    public static void main(String[] args) {
    queenPermutations(new boolean[4], 0,2,"");
    }

    private static void queenPermutations(boolean [] boxes, int qpsf, int tq, String ans){
        if(qpsf == tq) {
            count++;
            System.out.println(count + ". " + ans);
            return;
        }
            for (int i = 0; i < boxes.length; i++) {
                if(boxes[i] == false){
                    boxes[i] = true;
                    queenPermutations(boxes, qpsf+1,tq, ans+"q"+qpsf+i+" ");
                    boxes[i] = false;
                }
            }

        }
    }


