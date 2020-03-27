import java.util.Scanner;

public class NumberInWords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(inWords(n));
    }

    private static String inWords(int n) {
        int cnt = countDigit(n);
        StringBuilder res = new StringBuilder();

        while (n > 0){
            int temp = n / (int)Math.pow(10, cnt-1);
            String num = digit(temp);
            if (num != null && cnt != 2){
                res.append(num + " ");
            }
            String place = getPlace(cnt, temp);;
            if (place != null){
                res.append(place + " ");
            }
            n = n % (int)Math.pow(10, cnt-1);
            cnt--;
        }

        return res.toString();
    }

    public static String digit(int temp) {
        switch (temp){
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
        }
        return null;
    }

    public static String getPlace(int cnt, int n) {
        switch (cnt){
            case 2: return tens(n);
            case 3: return "hundred";
            case 4: return "thousand";
            case 5: return null;
        }
        return null;
    }

    public static String tens(int n) {
        switch (n){
            case 1: return "ten";
            case 2: return "twenty";
            case 3: return "thirty";
            case 4: return "forty";
            case 5: return "fifty";
            case 6: return "sixty";
            case 7: return "seventy";
            case 8: return "eighty";
            case 9: return "ninety";
        }

        return null;
    }

    public static int countDigit(int n) {
        int cnt = 0;

        while (n > 0){
            n = n / 10;
            cnt++;
        }

        return cnt;
    }
}
