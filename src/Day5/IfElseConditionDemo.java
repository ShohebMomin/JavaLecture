package day5;

import java.util.Scanner;

public class IfElseConditionDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Salary");
        double salary = sc.nextDouble();
        if(salary >= 100000){
            System.out.println("very good");
        }
        else if(salary >= 75000){
            System.out.println("very good");
        }
        else if(salary >= 50000){
            System.out.println("good");
        }
        else if(salary >= 25000){
            System.out.println("Acceptable");
        }
        else{
            System.out.println("get better");
        }
    }
}

