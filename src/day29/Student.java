package day29;

import java.util.Scanner;

public class Student {
    private int rno;						//apna apna instance scope  aka object scope
    private String studentName;				//instance scope
    private double per;						//instance scope

    static private String batchName="B13";	//static aka class scope


    public void acceptStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Roll No");
        this.rno = sc.nextInt();
        System.out.println("Enter Your Name");
        this.studentName = sc.next();
        System.out.println("Enter Your Percentage");
        this.per = sc.nextDouble();
    }
    public void displayStudent(){
        System.out.println("Roll No is " + this.rno);
        System.out.println("Name is " + this.studentName);
        System.out.println("Percentage is " + this.per);
        System.out.println("I am studying in batch " + Student.batchName);
    }
}
