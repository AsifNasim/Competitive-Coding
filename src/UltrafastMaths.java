import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class UltrafastMaths {
    static Scanner s = new Scanner(System.in);

    public static void main(String args[]) {
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            String n1 = s.next();
            String n2 = s.next();
            ultrafastMaths(n1, n2);
        }
    }

    //    private static void ultrafastMaths(int n1, int n2){
//        int ans = 0;
//        while(n1 != 0 && n2 != 0){
//            if((n1^n2) == 0){
//                ans = ans*10 +0;
////                System.out.print("0");
//            }
//            else {
//                ans = ans*10 +1;
////                System.out.print("1");
//            }
//            n1 = n1/10;
//            n2 = n2/10;
//        }
//        reverse(ans);
//    }
    private static void reverse(int ans) {
        int reverseNumber = 0;
        while (ans != 0) {
            int lastDigit = ans % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            ans = ans / 10;

        }
        System.out.print(reverseNumber);
    }

    private static void ultrafastMaths(String n1, String n2) {

        int i = 0;

        String ans = "";
        while (i < n1.length()) {
            ans += ((n1.charAt(i)) ^ (n2.charAt(i)));
            i++;
        }
        System.out.println(ans);

    }
    }