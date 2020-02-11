import java.util.Scanner;

public class PrintChar {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
//        String str = s.nextLine();
//        printChar(str);
//        printSubstring(str);
        long start = System.currentTimeMillis();
        stringPerformance();
        long end = System.currentTimeMillis();
        System.out.println("String Performance");
        System.out.println(end - start);

        long start_1 = System.currentTimeMillis();
        stringPerformancesb();
        long end_1 = System.currentTimeMillis();
        System.out.println("String Builder Performance");
        System.out.println(end_1 - start_1);
    }

    private static void stringPerformancesb() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 100000; i++) {
            sb.append(i);
        }
    }
    private static void stringPerformance() {
        String s = " ";
        for (int i = 0; i <= 100000; i++) {
            s = s+i;
        }
    }

    private static void printSubstring(String str) {
        for (int i = 0; i <= str.length()-1; i++) {
            for (int j = i+1; j <= str.length(); j++) {
                System.out.println(str.substring(i,j));
            }
        }
    }

    private static void printChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }


}
