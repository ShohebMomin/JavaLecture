package day32;

import java.util.Scanner;

public class Main {
    public void main() {
        acceptPerson();
    }
    public void acceptPerson(){
        Scanner sc = new Scanner(System.in);
        int age;
        String name;
        String city;
        System.out.println("Enter Your Designation");
        String designation = sc.nextLine();
        System.out.println("Enter The Name");
        name  = sc.next();
        System.out.println("Enter The age ");
        age = sc.nextInt();
        System.out.println("Enter The City");
        city = sc.next();
        System.out.println("Enter Your Salary");
        double salary = sc.nextDouble();
        System.out.println("Enter Your Employee ID");
        int id = sc.nextInt();
        Person p1 = new Person(name, age, city);
        p1.displayPerson();
        Employee e1 = new Employee(id, designation, salary);
        e1.displayEmployee();
    }
}
