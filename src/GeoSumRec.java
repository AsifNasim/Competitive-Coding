import java.util.Scanner;

public class GeoSumRec {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int k = s.nextInt();
        double sum = geoSum(k);
        System.out.println(sum);
    }

    private static double geoSum(int k) {
        if(k == 0){
            return 1;
        }
        return 1/Math.pow(2,k)+ geoSum(k-1);
    }
}
