package day11;

import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Fibonacci series");
        int length = sc.nextInt(); // 0 1 1 2 3 5 8
            int n1 = 0;
            int n2 = 1;
            System.out.println(n1); // 0
            System.out.println(n2); // 1
        for(int i = 3; i<=7; i++){
            int n3 = n1+n2; // 3
            System.out.println(n3);
            n1=n2; // n1 = 1
            n2=n3; // n2 = 3
        }
    }
}
