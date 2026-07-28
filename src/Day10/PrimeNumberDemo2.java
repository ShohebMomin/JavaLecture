package day10;

import java.util.Scanner;

public class PrimeNumberDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        isNumberPrimeNumber(num);
    }

    public static void isNumberPrimeNumber(int num){
        boolean isPrime = true;
        int iteration=0;
        for(int i = 2; i<num; i++){
            if(num%i ==0){
                isPrime=false;
                break;
            }
            iteration++;
        }
        if(isPrime){
            System.out.println(num+ " is Prime");
        }else{
            System.out.println(num+ "is not Prime");
        }
        System.out.println(iteration + " in iterations");
    }
}

