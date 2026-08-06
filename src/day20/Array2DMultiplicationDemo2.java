package day20;

import java.util.Scanner;

public class Array2DMultiplicationDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows");
        int r1 = sc.nextInt();
        System.out.println("Enter Number of Columns");
        int c1 = sc.nextInt();
        int arr[][] = new int[r1][c1];

        System.out.println("Enter The Values of Array");
        for (int i = 0; i<r1;i++){
            for(int j = 0; j<c1;j++){
            arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Max Number in the array is "+maxNumber(arr));
    }
    public static int maxNumber(int arr[][]){
        int max = arr[0][0];
    for(int i =1; i<arr.length;i++){
       for (int j = 0; j<arr.length; j++){
           System.out.print(arr[i][j] + "\t");
           if(arr[i][j]> max){
               max = arr[i][j];
           }
       }
        System.out.println();
    }
    return max;
    }
}
