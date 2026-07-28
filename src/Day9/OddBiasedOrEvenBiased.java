package day9;

import java.util.Scanner;

public class OddBiasedOrEvenBiased {
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
            }else{
                evenCounter++;
            }
            number = number/10;
        }
        if(oddCounter>evenCounter){

        System.out.println("The digit count is odd biased " + oddCounter);
        } else if (evenCounter>oddCounter) {
        System.out.println("The digit count is even biased " + evenCounter);
        }else{
            System.out.println("The digit count is neutral");
        }
    }

}
