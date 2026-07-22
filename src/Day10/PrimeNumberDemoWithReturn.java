import java.util.Scanner;

public class PrimeNumberDemoWithReturn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int numbers = sc.nextInt();
        isNumberPrimeNumber(numbers);
    }
    public static void isNumberPrimeNumber(int num){
        for(int j =1; j<=num; j++){
            boolean isPrime = j > 1;
            for(int i = 2; i<=Math.sqrt(j); i++){
                if(j%i ==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime)
                System.out.println(j+ " is Prime");
        }
    }
}