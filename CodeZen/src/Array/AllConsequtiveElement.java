package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AllConsequtiveElement {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        int [] arr = utils.takeInput();
        System.out.println(consqElem(arr));
        Arrays.sort(arr);

    }

    private static boolean consqElem(int[] arr) {
        Arrays.sort(arr);
        int i =0;
        int j = 1;
        while (i < arr.length-1){
            if(arr[j] - arr[i] != 1){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}
