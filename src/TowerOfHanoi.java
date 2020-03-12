import java.util.Scanner;

public class TowerOfHanoi {
    static Scanner s = new Scanner(System.in);
    static int count = 0;
    public static void main(String[] args) {
        int disk = s.nextInt();
        towerofHanoi(disk, "T1", "T3", "T2");
        System.out.println(count-1);
    }

    private static void towerofHanoi(int disc, String  T1, String T3, String T2) {
        if(disc == 0){
            count++;
            return;
        }
        towerofHanoi(disc -1, T1, T2 , T3);
        System.out.println("Move "+disc+"th disc from " +T1 +" to "+T2);
        towerofHanoi(disc -1, T3, T1, T2);
    }
}
