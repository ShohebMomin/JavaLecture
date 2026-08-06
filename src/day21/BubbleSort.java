package day21;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {7,6,9,8,4};
        System.out.println("before" + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("after" + Arrays.toString(arr));
    }
    public static void bubbleSort(int arr[]){
        for(int i = 1; i<=arr.length-1; i++){
            for(int j = 0; j<arr.length-i ; j++){
                if(arr[j] < arr[j+1]){ // for   descending order change this to less than "<"
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

