package Array;

import java.util.Scanner;

public class AlternativeElement {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int [] arr = utils.takeInput();
        int pos = 0;
        int neg = 1;
        int [] tempArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                tempArr[pos] = arr[i];
                pos += 2;
            }
            else if( arr[i] < 0){
                tempArr[neg] = arr[i];
                neg += 2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = tempArr[i];
        }
        utils.display(arr);

    }
}
