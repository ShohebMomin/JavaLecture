package day6.loops;

import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(i <= 3){
            System.out.println("Enter your age");
            int age = sc.nextInt();
            if(age >= 18) {
                System.out.println("adult");
            }else{
                System.out.println("Minor");
            }
            i = i+1;
        }
    }
}
