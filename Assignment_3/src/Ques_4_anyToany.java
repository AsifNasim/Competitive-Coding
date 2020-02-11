import java.util.Scanner;

public class Ques_4_anyToany {
    static Scanner s = new Scanner(System.in);
//    private static int destNumSys(int srcNum, int srcBase, int destBase){
//        int destNum =0;
//        int place =1;
//        while ( srcNum > 0){
//            int lastDigit = srcNum%destBase;
//            destNum += lastDigit*place;
//            place *= srcBase;
//            srcNum /= srcBase;
//        }
//        return destNum;
//    }
    private static int anyToDec(int srcNum, int srcBase){
        int decimal =0;
        int place = 1;
        while ( srcNum > 0){
            int lastDigit = srcNum%10;
            decimal += lastDigit*place;
            place *= srcBase;
            srcNum /= 10;
        }
        return  decimal;
    }

    private static int decToAny(int dec, int destBase){
        int any =0;
        int place = 1;
        while ( dec > 0){
            int lastDigit = dec%destBase;
            any += lastDigit*place;
            place *= 10;
            dec /= destBase;
        }
        return any;
    }
    public static void main(String[] args) {
        int srcNum = s.nextInt();
        int srcBase = s.nextInt();
        int destBase = s.nextInt();

        int decimal = anyToDec(srcNum, srcBase);
        int any = decToAny(decimal, destBase);
        System.out.println(any);

    }
}
