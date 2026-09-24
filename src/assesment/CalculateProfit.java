package assesment;

import java.util.Scanner;

public class CalculateProfit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost Price");
        double costPrice = sc.nextDouble();
        System.out.println("Enter Selling Price");
        double sellingPrice = sc.nextDouble();
        double profit = calculateProfit(costPrice, sellingPrice);
        if (sellingPrice>costPrice) {
            System.out.println("Profit is: " + profit);
        }else{
            System.out.println("Loss");
        }
    }
    public static double calculateProfit(double cp, double sp){
        return sp-cp;
    }
}
