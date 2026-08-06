package day20;

import java.util.Scanner;

public class Array2DDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][]= new int[3][3];
        for(int i=0;i<matrix.length;i++)  //rows
        {
            for(int j=0;j<matrix[i].length;j++) //cols
            {
                System.out.println("Enter a Number" +(j+1));
                matrix[i][j]=sc.nextInt();
            }
        }
        maxNumberInRow(matrix);
    }
    public static void maxNumberInRow(int matrix[][]){
        for(int i =0; i<matrix.length; i++){
            int max = matrix[i][0];
           for(int j=0; j<matrix.length;j++){
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
           }
            System.out.println("Max value from the Array row " + (i+1) + " is " + max);
        }
    }
}
