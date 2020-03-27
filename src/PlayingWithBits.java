import java.util.Scanner;

public class PlayingWithBits {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int q = s.nextInt();
        for (int i = 0; i < q; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int ans = CountBITS(a,b);
            System.out.println(ans);
        }

    }

//    private static int CountSetBits(int a, int b) {
//
//        while (a <= b){
//            int c = a+1;
//            while (a > 0 && c > 0){
//                if((a&1) == 1){
//                    count += 1;
//                }
//                if(((c)&1) == 1){
//                    count += 1;
//                }
//                a = a>>1;
//                c = c>>1;
//
//            }
//            a = a+1;
//        }
//    return count;
//    }

    private static int CountBITS(int a, int b){
        int count = 0;
        for (int i = a; i <=b ; i++) {
            int x = i;
            while (x> 0){
                if((x&1) == 1){
                    count = count+1;
                }
                x = x>>1;
            }
        }
        return count;
    }
}
