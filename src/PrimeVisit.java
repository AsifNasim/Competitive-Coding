import java.util.Scanner;

public class PrimeVisit {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        PrimeVisit m = new PrimeVisit();
        int t = s.nextInt();
        for (int i = 0; i <t; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println(m.primeVisits(a,b));
        }
    }

    public boolean isPrime(int num){
        if(num <= 0 || num ==1){
            return false;
        }
        if(num == 2){
            return true;
        }
        //for even check
        if((num&1) == 0){
            return false;
        }
        boolean isPrime = true;
        //checking till square root of the number
        for (int i = 3; i*i < num ; i+=2) {
            if(num%i == 0){
                return false;
            }
        }
        return isPrime;
    }

    public int primeVisits(int start, int end){
        int [] prime = new int[end+1];
        prime[0] = 0;
        prime[1] = 0;
        //All odds
        for(int i =3; i<= end; i+= 2){
            if((i&1) == 0 || i < start){
                prime[i] = 0;
            }
            else{
                prime[i] = 1;
            }
        }
        if(start <= 2){
            prime[2] = 1;
        }
        for (int i = 3; i <= end ; i+=2) {
            int j =2;
            while (i*j <= end){
                prime[i*j] = 0;
                j++;
            }
        }
        int sum = 0;
        for (int i = 0; i <= end ; i++) {
            if(prime[i] == 1){
                sum++;
            }
        }
        return sum;
    }
}
