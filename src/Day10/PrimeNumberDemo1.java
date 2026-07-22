import java.util.Scanner;

public class PrimeNumberDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        isNumberPrimeNumber(num);
    }

    public static void isNumberPrimeNumber(int num){
        int counter =0;
        int iteration=0;
        for(int i = 1; i<=num; i++){
            if(num%i ==0){
                counter++;
            }
                iteration++;
        }
        if(counter == 2){
            System.out.println(num+ " is Prime");
        }else{
            System.out.println(num+ "is not Prime");
        }
        System.out.println(iteration + " in iterations");
    }
}
