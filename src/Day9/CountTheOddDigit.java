package day9;

import java.util.Scanner;

public class CountTheOddDigit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Number");
        long number = sc.nextLong();

        int counter = 0;
        while(number>0){
            long rem =number % 10;
            if(rem%2 == 1){
                counter++;
            }
            number = number/10;
        }
        System.out.println("The odd digit count in the number is " + counter);
    }
}
