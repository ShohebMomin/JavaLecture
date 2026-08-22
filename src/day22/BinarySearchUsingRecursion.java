package day22;

public class BinarySearchUsingRecursion {
    static void main() {
        int arr[] = {1, 2, 3, 4, 5};
        int search = 2;
        int left = 0;
        int right = arr.length-1;
        System.out.println(search+ " Found at index of: " + binarySearch(arr, search, left, right));
    }
    public static int binarySearch(int arr[], int search, int left, int right){
        if(left<=right){
            int mid = (left + right)/2;
            if(arr[mid] == search){
                return mid;
            }
            if(arr[mid] < search){
                return binarySearch(arr,search,mid+1,right);
            } if (arr[mid] >search) {
                return binarySearch(arr, search, left, mid-1);
            }
        }
        return -1;
    }
}
