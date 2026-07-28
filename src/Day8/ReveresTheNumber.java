package day8;

import java.util.Scanner;

public class ReveresTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int rem;
        String rev="";
        while(n>0){
            rem = n%10;
            rev = rev + rem;
            n = n/10;
        }
        System.out.println("Sum Of all digit is " + rev);
    }
}
