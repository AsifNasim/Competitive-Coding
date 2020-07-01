package Array;
import java.util.Arrays;
import java.util.Scanner;
public class Intersection {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int s1 = s.nextInt();
        int [] arr1 = new int[s1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = s.nextInt();
        }

        int s2 = s.nextInt();
        int [] arr2 = new int[s2];
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = s.nextInt();
        }
        arrayIntesection(arr1, arr2);
    }

    private static void arrayIntesection(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;

        while (i < arr1.length  && j < arr2.length){
            if (arr1[i] == arr2[j]){
                System.out.println(arr1[i]);
                i++;
                j++;
            }

            else if(arr1[i] < arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }



    }
}
