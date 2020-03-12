import java.util.Scanner;

public class SequenceNumbers {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int processed =0;
        int end = s.nextInt();
        numSequence(processed, end);
    }

    private static void numSequence(int processed, int end) {
        if(processed>end){
//            System.out.println(processed);
            return;
        }


        for (int i = 0; i <=9 ; i++) {
            if(processed == 0 && i == 0){
                System.out.println("0");
                continue;
            }
            int item = processed*10 +i;
            if(item <= end){
                System.out.println(item);
            }
            numSequence(item, end);


        }

    }


}
