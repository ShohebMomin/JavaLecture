package day21;

import java.util.Arrays;

public class SelectionSortChatGpt {
    static void main() {
        int arr[] = {7,6,9,8,4};
        System.out.println("before" + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("after" + Arrays.toString(arr));
    }
    public static void selectionSort(int arr[]){
        for(int i = 0; i<arr.length; i++){
            int minIndex = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[minIndex]){ // for   descending order change this to less than "<"
                   minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
