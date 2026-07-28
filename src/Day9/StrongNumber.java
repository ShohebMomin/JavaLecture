package day9;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int strongNum = strongNumber(num);
        System.out.println(strongNum == num ? "The number is Strong" : " the number is not a strong number");
    }
    public static int strongNumber(int num){
        int sum =0;
        int rem;
        while(num>0){
            rem = num%10;
            for(int i = 1; i<=rem; i++){
            int factorial = 1;
            factorial *= i;
            }
            num = num/10;
        }
        return sum;
    }
}
