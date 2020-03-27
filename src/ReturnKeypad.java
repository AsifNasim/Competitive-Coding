import java.util.Scanner;

public class ReturnKeypad {
    static Scanner s = new Scanner(System.in);
    static int count = 0;
    public static void main(String[] args) {
        int n = s.nextInt();
        String [] ans = returnKeypad(n);
        for (int i = 0; i <ans.length ; i++) {
            System.out.println(ans[i]);
        }
        System.out.println(count);

    }

    private static String[] returnKeypad(int n) {
        if(n == 0){
            String [] br = {""};
            return br;
        }

        int lastdigit = n%10;
        int smallDigit = n/10;
        char [] options = combinations(lastdigit);
        String[] smallAns = returnKeypad(smallDigit);
        String [] ans = new String[smallAns.length*options.length];
        int k =0;
        for (int i = 0; i < smallAns.length; i++) {
            for (int j = 0; j < options.length; j++) {
                ans[k] = smallAns[i]+ options[j];
                k++;
            }
        }
        count = smallAns.length*options.length;
        return ans;
    }

    private static char[] combinations(int n) {
        switch (n){
            case 2:
                char [] option2 = {'a','b','c'};
                return option2;
            case 3:
                char [] option3 = {'d','e','f'};
                return option3;
            case  4:
                char [] option4 = {'g','h','i'};
                return option4;
            case 5:
                char [] option5 = {'j','k','l'};
                return option5;
            case 6:
                char [] option6 = {'m','n','o'};
                return option6;
            case 7:
                char [] option7 = {'p','q','r','s'};
                return option7;
            case 8:
                char [] option8 = {'t','u','v'};
                return option8;
            case 9:
                char [] option9 = {'w','x','y','z'};
                return option9;
            default:
                char [] option = {'\0'};
                return option;
        }
    }
}
