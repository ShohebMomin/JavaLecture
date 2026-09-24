package assesment;

public class BinarySearch {
    static void main() {
        int arr[] = {10,20,30,40,50};
        int start = 0;
        int end = arr.length-1;
        int search = 40;
        binarySearch(arr, start, end, search);
    }
    public static void binarySearch(int arr[],int start,int end,int search) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == search) {
                System.out.println("Found at: " + mid);
                break;
            } else if (arr[mid] < search) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }
}
