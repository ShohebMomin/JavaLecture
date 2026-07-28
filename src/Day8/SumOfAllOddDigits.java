package day8;

import java.util.Scanner;

public class SumOfAllOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int rem;
        int sum = 0;
        while(n>0){
            rem = n%10;
            if(rem%2==0){ //checking here is the last digit from the n is odd or even.
                n = n/10; // if the number is even then we are doing n/10 to remove last digit and moving to next number
                continue; //then we're skipping the iteration
            }
            sum = sum+rem;
            n = n/10;
        }
        System.out.println("Sum Of all digit is " + sum);
    }
}
