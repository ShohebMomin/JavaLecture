package day3;

import java.util.Scanner;

public class FunctionScenario1copy {
    public static void main(String[] args){
        simpleInterest(); // ambani
    }
    public static void simpleInterest(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle");
        double principle = sc.nextDouble();

        System.out.println("Enter Rate of interest");
        double interestRate = sc.nextDouble();

        System.out.println("Enter Number of Years");
        double years = sc.nextDouble();

        double simpleInterest = (principle*interestRate*years)/100;
        System.out.println(simpleInterest);
    }
}
