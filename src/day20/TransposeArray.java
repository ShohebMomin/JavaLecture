package day20;

import java.util.Scanner;

public class TransposeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number of Rows");
        int r1 = sc.nextInt();
        System.out.println("Enter The Number of Columns");
        int c1 = sc.nextInt();
        int arr[][] = new int[r1][c1];
        int transposed[][]= new int[r1][c1];
        System.out.println("Enter the Values of Array");
        for(int i = 0; i<r1; i++){
            for (int j = 0; j<c1; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        transpose(arr ,transposed);
    }
    public static void transpose(int[][] arr, int[][] transposed){

        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr.length; j++){
                transposed[j][i] = arr[i][j];
                System.out.print(arr[i][j]+ "\t");
            }
            System.out.println();
        }
        for (int i = 0; i<transposed.length;i++){
            for (int j = 0; j<transposed.length; j++){
                System.out.print(transposed[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}
