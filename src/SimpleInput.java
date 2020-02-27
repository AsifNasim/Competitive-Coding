import java.util.Scanner;

public class SimpleInput {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int sum =0;
        while(true){
            int n = s.nextInt();
            if(n > -1000 && n< 1000 ){
                sum += n;
                if(sum >= 0){
                    System.out.println(n);
                }
                else{
                    break;
                }
            }
            else{
                break;
            }
        }
    }
}
