package day22;

public class BinarySearchDemo1 {
    static void main() {
        int arr[] = { 1,2,3,4,5};
        int start = 0;
        int end = arr.length-1;
        int search = 5;
        binarySearch(arr, start,end, search);
    }
    public static void binarySearch(int arr[],int start,int end,int search){
        while (start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == search){
                System.out.println("Found at: "+  mid);
                break;
            }else if(arr[mid]<search){
                start =mid+1;
            }else{
                end = mid-1;
            }
        }
    }
}
