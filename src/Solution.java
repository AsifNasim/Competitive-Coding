import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i < t ; i++) {
            int n = sc.nextInt();
            int A[] = new int[n];
            int B[] = new int[n];
            int solA = 0;
            for(int j = 0 ; j < n ; j++) {
                A[j] = sc.nextInt();
            }
            for(int j = 0 ; j < n ; j++) {
                B[j] = sc.nextInt();
            }
            for(int k =0; k< A.length; k++){
                for(int j =0; j< B.length; j++){
                    if(A[i] > A[j] && i ==j ){
                        solA += 1;
                    }
                }

            }
            System.out.println(solA);
        }

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}