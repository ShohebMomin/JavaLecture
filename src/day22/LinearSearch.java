package day22;

public class LinearSearch {
    static void main() {
        int arr[] ={8,7,4,2,6,3};
        int search = 3;
        linearSearch(arr, search);
    }
    public static void linearSearch(int arr[], int search){
        int flag = 0;
        for(int i =0 ; i< arr.length; i++){
            if(arr[i] == search){
                System.out.println("Found at index: " + i);
                flag=1;
                break;
            }
        }
        if(flag ==0) System.out.println("Not Found");
    }
}
