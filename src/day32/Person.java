package day32;

import java.util.Scanner;

// Inheritance
// access specifiers
public class Person {
    String name;
    int age;
    String city;
//    no args constructor
    public Person(){}
    // all args constructor
    public Person(String name, int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }
    public void displayPerson(){
        System.out.println("Name is " + this.name);
        System.out.println("Age is " + this.age);
        System.out.println("City is " + this.city);
    }
}
