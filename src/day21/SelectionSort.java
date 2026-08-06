package day21;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {7,6,9,8,4};
        System.out.println("before" + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("after" + Arrays.toString(arr));
    }

    public static void selectionSort(int arr[]){
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){ // for   descending order change this to less than "<"
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

