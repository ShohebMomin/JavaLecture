import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();

        int sum = armStrongNumber(num);
        if(sum ==num){
            System.out.println(num+ " is armstrong number");
        }else {
            System.out.println(num+ " is not armstrong number");
        }
    }
    public static int armStrongNumber(int num){
        int sum= 0;
        int rem;
        while(num>0){
            rem = num%10;
            sum = sum + (rem*rem*rem);
            num= num/10;
        }
        return sum;
    }
}