package day3;

import java.util.Scanner;

public class FunctionScenario3copy {
    public static void main(String[] args){ //Common man
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principle"); // buy
        double principle = sc.nextDouble();

        System.out.println("Enter Interest Rate"); // buy
        double rate = sc.nextDouble();

        System.out.println("Enter Years"); // buy
        double years = sc.nextDouble();

        double ans = interestRate(principle,rate,years); // call
        System.out.println(ans); // serve
    }
    public static double interestRate(double principle, double rate, double years){ //dishonest Caterers
        double si;
        si = (principle*rate*years)/100; //cook
        return si;
    }
}
