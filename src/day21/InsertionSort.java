package day21;

import java.util.Arrays;

public class InsertionSort {
    static void main() {
    int arr[] = {7,6,9,8,4};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int arr[]){
        for(int i = 1; i<arr.length; i++){
           int temp = arr[i];
           int j = i-1;
           while(j>=0 && arr[j] >= temp){
               arr[j+1] = arr[j];
               j--;
           }
           arr[j+1] = temp;
        }
    }
}
