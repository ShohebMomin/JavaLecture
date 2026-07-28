package day17;

import java.util.Scanner;

public class MaximumNumberFromTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to add in array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int sum =0;
        int sumOfAllEven = 0;
        int sumOfAllOdd = 0;
        System.out.println("Enter Elements of Array");
        for (int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int maximum = maxFinder(arr);
        System.out.println(maximum);
    }
    public static int maxFinder(int arr[]){
        int maxValue = arr[0];
        for (int i = 1; i<arr.length; i++){
            if (arr[i]> maxValue)maxValue = arr[i];
        }
        return maxValue;
    }
}
