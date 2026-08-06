package day20;

import java.util.Scanner;

public class ArrayMatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows of Matrix 1: ");
        int r1= sc.nextInt();
        System.out.println("Enter Number of Columns of Matrix 1: ");
        int c1 = sc.nextInt();

        System.out.println("Enter number of Rows of Matrix 2:  ");
        int r2= sc.nextInt();
        System.out.println("Enter Number of Columns of Matrix 2: ");
        int c2 = sc.nextInt();

        if(c1 == r2){
            int matrixA[][]= new int[r1][c1];
            int matrixB[][]= new int[r2][c2];
            int matrixC[][]= new int[r1][c2];
            System.out.println("length of matrix A "+ matrixA.length + " column13 " +c1);
            // Store values for Matrix A
            System.out.println("Enter values for Matrix A");
            for(int i =0 ; i<matrixA.length; i++){
                for (int j = 0; j<matrixA[i].length; j++){
                    matrixA[i][j] = sc.nextInt();
                }
            }
            // Store values for Matrix B
            System.out.println("Enter Values for Matrix B");
            for (int i = 0; i<matrixB.length; i++){
                for (int j =0; j< matrixB[i].length; j++){
                    matrixB[i][j] = sc.nextInt();
                }
            }
            // Display Matrix
            System.out.println("Matrix A");
            for(int i = 0; i<matrixA.length; i++){
                for (int j = 0; j<matrixA[i].length; j++){
                    System.out.print(matrixA[i][j] +"\t");
                }
                System.out.println();
            }
            System.out.println("Matrix B");
            for(int i = 0; i<matrixB.length; i++){
                for (int j = 0; j<matrixB[i].length; j++){
                    System.out.print(matrixB[i][j] +"\t");
                }
                System.out.println();
            }
            for(int i = 0; i<r1; i++){
                for(int j = 0; j<c2; j++){
                int sum = 0;
                    for(int k = 0; k<c1; k++){
                        sum += matrixA[i][k] * matrixB[k][j];
                    }
                matrixC[i][j] = sum;
                }
            }
                for(int i = 0; i<matrixC.length; i++){
                    for(int j = 0 ; j<matrixC.length; j++){
                        System.out.print(matrixC[i][j]+ "\t");
                    }
                    System.out.println();
                }
        }else{
            System.out.println("Multiplication is not possible for these Matrix!");
        }

    }
    public static void multiplication(){
    }

}
