package day20;

import java.util.Scanner;

public class MaxNumber2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int r1= sc.nextInt();
        System.out.println("Enter Number of Columns");
        int c1 = sc.nextInt();
        int matrix[][]= new int[r1][c1];
        System.out.println("Enter Values for Array");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("max value in the array is: " + maxNumber(matrix));
    }
    public static int maxNumber(int matrix[][]){
        int max = matrix[0][0];
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j< matrix[i].length; j++){
                System.out.print(matrix[i][j] + "\t");
                if(max<matrix[i][j]) max = matrix[i][j];
            }
            System.out.println();
        }
        return max;
    }
}
