package day3;

import java.util.Scanner;

public class FunctionScenario2copy {
    public static void main(String[] args){
       double ans = simpleInterest(); // comman man
        System.out.println(ans);
    }
    public static double simpleInterest(){ //honest Caterers
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principle");
        double principle = sc.nextDouble();

        System.out.println("Enter Interest Rate");
        double rate = sc.nextDouble();

        System.out.println("Enter Year");
        double year = sc.nextDouble();

        double si;
        si = (principle* rate*year );
        return si;
    }
}
