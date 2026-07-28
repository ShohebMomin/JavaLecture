package day6.loops;

import java.util.Scanner;

public class ForLoopDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <=3; i++){
            System.out.println("Enter your Name");
            String name = sc.nextLine();

            System.out.println("enter your principle");
            double principle = sc.nextDouble();

            System.out.println("enter your interest Rate");
            double rate = sc.nextDouble();

            System.out.println("enter years");
            double years = sc.nextDouble();
            double sp = principle*rate*years/100;
            System.out.println(name+ "'s" );
            System.out.println("Simple Interest for "+years+ " years" + " is " + sp);
        }
    }
}
