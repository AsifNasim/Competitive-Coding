import java.util.Scanner;

public class revisingQuadraticEquation {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        quadEquation(a,b,c);
    }

    private static void quadEquation(int a, int b, int c) {
        int d =(int)Math.pow(b,2) - 4*a*c;
        int underRoot = (int)Math.sqrt(d);
        int root_1 = (-b +underRoot )/2*a;
        int root_2 = (-b - underRoot )/ 2*a;

        if(root_1 == root_2){
            System.out.println("Real and Equal");
            System.out.println(root_1+" "+root_2);
        }
        if(root_1 != root_2){
            if(root_1 < root_2){
                System.out.println("Real and Distinct");
                System.out.println(root_1+" "+root_2);
            }
            else{
                System.out.println("Real and Distinct");
                System.out.println(root_2+" "+root_1);
            }
        }
        else {
            System.out.println("Imaginary");
        }
    }
}
