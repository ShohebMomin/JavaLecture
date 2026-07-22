/*
* A prime number is a whole number greater than \(1\) that is only divisible by \(1\) and itself.
* Its only factors are \(1\) and the number itself. For example, \(2, 3, 5, 7, 11\), and \(13\) are prime.
* The number \(1\) is never prime, and \(2\) is the only even prime number.*/
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        boolean isPrime = primeNumber(num);
        System.out.println(isPrime);
    }
    public static boolean primeNumber(int num){
        boolean isPrime = num > 1;
        for(int i = 2; i<Math.sqrt(num); i++){
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
