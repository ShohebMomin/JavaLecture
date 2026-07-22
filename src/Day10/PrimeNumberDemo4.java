import java.util.Scanner;

public class PrimeNumberDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        isNumberPrimeNumber(num);
    }

    public static void isNumberPrimeNumber(int num){
        boolean isPrime = num >1;
        int iteration=0;
        for(int i = 2; i<=Math.sqrt(num); i++){
            if(num%i ==0){
                isPrime=false;
            }
            iteration++;
        }
        if(isPrime){
            System.out.println(num+ " is Prime");
        }else{
            System.out.println(num+ "is not Prime");
        }
        System.out.println(iteration + " in iterations");
    }
}

