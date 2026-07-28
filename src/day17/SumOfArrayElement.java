package day17;

import java.util.Scanner;

public class SumOfArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to add in array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int sum =0;
        int sumOfAllEven = 0;
        int sumOfAllOdd = 0;
        System.out.println("Enter Elements of Array");
        for (int i = 0 ; i<size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i< arr.length; i++){
            sum = sum+arr[i];
            if (arr[i]%2!=0) sumOfAllOdd = sumOfAllOdd+arr[i];
            if (arr[i]%2==0) sumOfAllEven = sumOfAllEven + arr[i];
        }
        System.out.println("Sum of all elements " + sum);
        System.out.println("Sum of all Odd elements " + sumOfAllOdd);
        System.out.println("Sum of all Even elements " + sumOfAllEven);
    }
}
