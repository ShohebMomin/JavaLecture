package day20;

import java.util.Scanner;

public class SumOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number of Rows");
        int r1 = sc.nextInt();
        System.out.println("Enter The Number of Columns");
        int c1 = sc.nextInt();
        int matrixA[][] = new int[r1][c1];

        int matrixSum[][] = new int[r1][c1];


        System.out.println("Enter The Number of Rows for Matrix B");
        int r2  = sc.nextInt();
        System.out.println("Enter The Number of Columns for Matrix B");
        int c2  = sc.nextInt();
        int matrixB[][]= new int[r1][c1];

        System.out.println("Enter the Values of Matrix A");
        for(int i = 0; i<r1; i++){
            for (int j = 0; j<c1; j++){
                matrixA[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the Values of Matrix B");
        for(int i = 0; i<r2; i++){
            for (int j = 0; j<c2; j++){
                matrixB[i][j] = sc.nextInt();
            }
        }
        sumOfMatrix(matrixA, matrixB,matrixSum);
    }
    public static void sumOfMatrix(int matrixA[][], int matrixB[][], int matrixSum[][]){
                System.out.println("matrix A");
        for(int i=0; i<matrixA.length; i++){
            for (int j =0; j<matrixA.length; j++){
                System.out.print(matrixA[i][j] + " \t");
                matrixSum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
            System.out.println();
        }
                System.out.println("Matrix B");
        for(int i=0; i<matrixA.length; i++){
            for (int j =0; j<matrixA.length; j++){
                System.out.print(matrixB[i][j] + " \t");
            }
            System.out.println();
        }
        System.out.println("Sum");
        for(int i=0; i<matrixA.length; i++){
            for (int j =0; j<matrixA.length; j++){
                System.out.print(matrixSum[i][j] + " \t");
            }
            System.out.println();
        }


    }
}
