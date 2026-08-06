package day20;

import java.util.Scanner;

public class MaxNumber2DArrayDemo2 {
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
        maxNumber(matrix);
    }
    public static void maxNumber(int matrix[][]){
        for(int i = 0; i<matrix.length;i++){
        int max = matrix[i][0];
            for(int j = 0; j< matrix[i].length; j++){
                System.out.print(matrix[i][j] + "\t");
                if(max<matrix[i][j]) max = matrix[i][j];
            }
//            System.out.println();
            System.out.println("max number from row " + (i+1) + " is " + max);

        }

    }
}
