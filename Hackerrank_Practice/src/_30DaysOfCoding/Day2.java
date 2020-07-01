package _30DaysOfCoding;

import java.util.Scanner;

public class Day2 {
    // Operators
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        double mealCost = s.nextDouble();
        int tipCost = s.nextInt();
        int taxPer = s.nextInt();

        float tipCost_2;
        tipCost_2= (float)(mealCost) *(float) (tipCost)/100;

        float taxPer_2;
        taxPer_2 = (float)(mealCost) * (float)(taxPer)/100;

        int totalCost = (int)(mealCost + tipCost_2+ taxPer_2);
        System.out.println(totalCost);
    }
}
