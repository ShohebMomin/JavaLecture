package day33;

import java.util.Scanner;

public class Person {
    String name;
    String add;
    String pan;
    Scanner sc = new Scanner(System.in);

    public Person(){
        System.out.println("Enter Your Name");
        this.name = sc.nextLine();
        System.out.println("Enter Your Address");
        this.add = sc.nextLine();
        System.out.println("Enter Your PAN Number");
        this.pan = sc.next();
    }
    void displayPerson(){
        System.out.println(this.name);
        System.out.println(this.add);
        System.out.println(this.pan);
    }
}

