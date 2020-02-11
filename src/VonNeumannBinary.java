import java.util.Scanner;

public class VonNeumannBinary {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int n = s.nextInt();
        for (int i = 0; i <n ; i++) {
            int bin = s.nextInt();
            int decimal = 0;
            int place = 1;
            while (bin != 0) {
                int lastDigit = bin % 10;
                decimal += lastDigit * place;
                place *= 2;
                bin /= 10;
            }
            System.out.println(decimal);


        }

        }


    }



