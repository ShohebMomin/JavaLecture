package day36;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionDemo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numerator");
        try{
        int numerator = sc.nextInt();
        System.out.println("Enter Denominator");
        int denominator = sc.nextInt();

            double result = numerator/denominator;
            System.out.println(result);
        }
        catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        catch (InputMismatchException ex){
            System.out.println("Please enter valid integer values only");
        }
        System.out.println("Code continued");
    }
}
