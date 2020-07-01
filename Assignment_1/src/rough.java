import java.util.Scanner;

public class rough{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        int i = 4;
//        double d  = 4.0;
//        String s = "Hackerrank! ";
//
//        int n = sc.nextInt();
//        double nd = sc.nextDouble();
//        sc.nextLine();
//        String str = sc.nextLine();
//
//        System.out.println(i+n);
//        System.out.println(d+nd);
//        System.out.println(s+" "+ str);
        int n1  = sc.nextInt();
        int n2 = sc.nextInt();

        while (n1%n2 != 0){
            int rem = n1%n2;
            n1 = n2;
            n2 = rem;
        }
        System.out.println(n2);
    }
}