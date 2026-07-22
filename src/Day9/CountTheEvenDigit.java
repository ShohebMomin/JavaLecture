import java.util.Scanner;

public class CountTheEvenDigit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Number");
        int counter = 0;

        long number = sc.nextLong();
        while(number>0){
            long rem =number % 10;
            if(rem%2 == 0){
                counter++;
            }
            number = number/10;
        }
        System.out.println("The Even digit count in the number is " + counter);
    }
}
