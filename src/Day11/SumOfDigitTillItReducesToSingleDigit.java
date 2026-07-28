package day11;

import java.util.Scanner;

public class SumOfDigitTillItReducesToSingleDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();
        int result = sumOfDTR(number);
        System.out.println(result);
    }
    public static int sumOfDTR(int number){
        while(number>9){
        int sum = 0;
            while (number>0){
            int rem = number%10;
            sum = sum + rem;
            number = number/10;
            }
            number = sum;
        }
        return number;
    }
}
