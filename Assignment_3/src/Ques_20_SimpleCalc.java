import java.util.Scanner;

public class Ques_20_SimpleCalc {
    /*Simple Calculator*/
    static  Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter 1st Number: ");
        int i1 = s.nextInt();
        System.out.println("Enter Second Number: ");
        int i2 = s.nextInt();
        System.out.println("Enter the Operator");
        String str = s.next();
        char ch = str.charAt(0);
        simpleCalc(i1,i2,ch);
    }

    private static void simpleCalc(int num1, int num2, char ch) {
        if(ch == '+'){
            int sum = num1 +num2;
            System.out.println(sum);
        }
        else if(ch == '-'){
            int difference = num1 - num2;
            System.out.println(difference);
        }
        else if (ch == '*'){
            int product = num1*num2;
            System.out.println(product);
        }
        else if (ch == '/'){
            int quotient = num1/num2;
            System.out.println(quotient);
        }
        else if (ch == '%'){
            int remainder = num1%num2;
            System.out.println(remainder);
        }
        else if(ch == 'X' || ch == 'x'){
            System.out.println("End of the program");
            againEnterNos();
        }
    }

    private static void againEnterNos() {
        System.out.println("Enter 1st Number: ");
        int i1 = s.nextInt();
        System.out.println("Enter Second Number: ");
        int i2 = s.nextInt();
        System.out.println("Enter the Operator");
        String str = s.next();
        char ch = str.charAt(0);
        simpleCalc(i1,i2,ch);
    }
}
