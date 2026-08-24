package day36;

import java.util.Scanner;

public class ArithmeticExceptionDemo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numerator");
        int numerator = sc.nextInt();
        System.out.println("Enter Denominator");
        int denominator = sc.nextInt();
        try{
            double result = numerator/denominator;
            System.out.println(result);
        }
        catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Code continued");
    }
}
