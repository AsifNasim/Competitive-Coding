import java.util.Scanner;

public class countSetBits {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int nBits = s.nextInt();
        int count = 0;
        while (nBits!=0){
            if((nBits&1)==1){
                count++;
            }

            nBits = nBits>>1;
        }

        System.out.println(count);
    }

}
