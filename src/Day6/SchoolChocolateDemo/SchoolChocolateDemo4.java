//each class has a quota of 20 chocolates, once the quota is reached stop the collection
//if any extra chocolates are collected return them back to the CT
//odd roll numbers are boys, even roll numbers are girls
//boys must bring chocolates in x 2, girls should bring chocolates in multiple 5
import java.util.Scanner;
public class SchoolChocolateDemo4 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int quota = 20;
            int sum = 0;
        for(int rno = 1; rno<=5; rno++){
            System.out.println("Roll No. " +rno+" how many chocolates you bought");
            int chocolate = sc.nextInt();
            if((rno%2 == 1 && chocolate%2==0) || (rno%2 ==0 && chocolate%5==0)){
            sum = sum + chocolate;
            }else {
                System.out.println("Chocolate is not accepted from roll no " + rno);
                continue;
            }
            if(sum >=quota)
                break;
        }
        System.out.println("extra chocolates "+ (sum - quota));    }
}
