import java.util.Scanner;

public class Converter {
    public static int main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int base = s.nextInt();
//       int result =  binaryTodec(n);
//        System.out.println(result);
//        int result2 = anyTodec(n,base);
//        System.out.print(decTobin(11));
//        System.out.print(binaryTodec(1011));
//        System.out.print(anyTodec(1011,2));
        System.out.println(anyToany(1011,2));
        return 0; // it will ask for the void type of the statement, otherwise it wont run
    }


    private static int anyToany(int n, int base){
        int deci = anyTodec(n, base);
        return  decTobin(deci);
    }


    private static int binaryTodec(int n) {
        int deci = 0;

        int i =0;
        while (n != 0){
            int lastNumber = n%10;
            deci = deci + lastNumber*(int)Math.pow(2,i);
            i++;
            n= n/10;
        }
       return deci;
    }

    private static int anyTodec(int n, int base){
        int deci = 0;
        int place =1;

        int i =0;
        while (n != 0){
            int lastNumber = 0;
            lastNumber = n%10;
            deci = deci + lastNumber*place;
            place =place*base;

            n= n/10;
            i++;
        }

        return deci;
    }

    public static int decTobin(int n){
        int bin = 0;
        int place =1;
        while (n!= 0){
            int lastNumber = 0;
            lastNumber = n%2;
            bin = bin + lastNumber*place;
            place =place*10;

            n= n/2;
        }

        return bin;
    }


}
