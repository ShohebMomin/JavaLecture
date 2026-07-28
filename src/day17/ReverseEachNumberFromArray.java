package day17;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseEachNumberFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to add in array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements of Array");
        for (int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
//        reverseElement(arr);
        System.out.println("Original Array" + Arrays.toString(arr));
        int[] revArray = reverseElementWithNewArray(arr);
        System.out.println(Arrays.toString(revArray));
    }
    public static void reverseElement(int arr[]){
        for (int i = 0; i<arr.length;i++){
        int rev =0;
            int copy = arr[i];
            while (copy>0){
            int rem = copy%10;
            rev = (rev*10) + rem;
            copy = copy/10;
            }
            arr[i] = rev;
        }
    }
    public static int[] reverseElementWithNewArray(int[] arr){
        int arr2[] = new int[arr.length];
        for (int i = 0; i<arr.length;i++){
            int rev =0;
            int copy = arr[i];
            while (copy>0){
                int rem = copy%10;
                rev = (rev*10) + rem;
                copy = copy/10;
            }
            arr2[i] = rev;
        }
            return arr2;
    }
}
