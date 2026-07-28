package day9;

import java.util.Scanner;

public class CountTheEvenAndOddDigit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Number");
        long number = sc.nextLong();
        int oddCounter = 0;
        int evenCounter = 0;
        while(number>0){
            long rem =number % 10;
            if(rem%2 == 1){
                oddCounter++;
            }else {
            evenCounter++;
            }
            number = number/10;
        }
        System.out.println("The Odd digit count in the number is " + oddCounter);
        System.out.println("The Even digit count in the number is " + evenCounter);
    }
}
