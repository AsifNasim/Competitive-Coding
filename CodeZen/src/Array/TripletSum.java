package Array;

import java.util.Scanner;
import java.util.Arrays;
public class TripletSum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int target = s.nextInt();
        FindTriplet(arr, target);
    }

    public static void FindTriplet(int[] arr, int x){
        /* Your class should be named TripletSum.
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print output and don't return it.
         * Taking input is handled automatically.
         */
        Arrays.sort(arr);
        for(int i =0; i< arr.length ; i++){
            int start = i+1;
            int end = arr.length - 1;
            int val = x - arr[i];

            while(start < end ){
                if(arr[start] + arr[end] > val){
                    end--;
                }
                else if(arr[start] + arr[end] < val){
                    start++;
                }
                else{
                    int cnt1 = 0, cnt2 = 0;
                    for(int j = start; j <= end; j++){
                        if(arr[j] == arr[start]){
                            cnt1++;
                        }
                        else{
                            break;
                        }

                        for(int l = start; l <= end; l--){
                            if(arr[l] == arr[end]){
                                cnt2++;
                            }
                            else{
                                break;
                            }

                            int combine = cnt1 * cnt2;
                            if(arr[start] == arr[end]){
                                combine = ((end-start+1)*(end-start))/2;
                                for(int k =0; k< combine; k++){
                                    System.out.println(arr[i]+" "+arr[start]+" "+ arr[end]);
                                }
                                start = start+cnt1;
                                end = end - cnt2;
                            }
                        }
                    }
                }
            }
        }
    }
}
