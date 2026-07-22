import java.util.Scanner;

public class SchoolChocolateDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int rno = 1; rno<=5; rno++){
            System.out.println("Roll No. " +rno+" how many chocolates you bought");
            int chocolate = sc.nextInt();
            sum = sum + chocolate;
        }
        System.out.println(sum);
    }
}
