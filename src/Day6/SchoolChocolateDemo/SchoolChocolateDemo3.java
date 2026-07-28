package day6.schoolchocolatedemo;

import java.util.Scanner;

//each class has a quota of 20 chocolates, once the quota is reached stop the collection
//if any extra chocolates are collected return them back to the CT
public class SchoolChocolateDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quota = 20;
        int sum = 0;
        for(int rno = 1; rno<=5; rno++){
            System.out.println("Roll No. " +rno+" how many chocolates you bought");
            int chocolate = sc.nextInt();
            sum = sum + chocolate;
            if(sum >=quota)
                break;
        }
        System.out.println("extra chocolates "+ (sum - quota));
    }
}
