package day24;
import java.util.Arrays;
public class RotateArrayLeftByOne {
        public static void main(String[] args) {
            int arr[] = {1,2,3,4,5};
            int n =3;
            System.out.println(Arrays.toString(arr));
            rotate(arr, n);
            System.out.println(Arrays.toString(arr));
        }
        public static void rotate(int arr[],int n){
            while(n>0){
            int temp = arr[0];
            for(int i = 0; i<arr.length-1; i++){
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = temp;
            n--;
            }
        }
}

