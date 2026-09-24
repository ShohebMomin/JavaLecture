package assesment;

import java.util.Scanner;

public class SumofDigitsofaThreeDigitNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 digit Number");
        int num =  sc.nextInt();
        int result =  sumOfDigit(num);
        System.out.println("Sum of "+ num + " is " + result);
    }

    private static int sumOfDigit(int num) {
        int sum = 0;
        while (num>0){

            int rem =  num%10;
            sum += rem;
            num = num/10;
        }
        return sum;
    }
}
