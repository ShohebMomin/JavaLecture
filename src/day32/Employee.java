package day32;

import java.util.Scanner;

public class Employee extends Person {
    int empId;
    String designation;
    double salary;

    public Employee(){    }
    public Employee(int empId, String designation, double salary){
        this.empId = empId;
        this.designation = designation;
        this.salary = salary;
    }
    public void displayEmployee(){
            System.out.println("Employee ID is "+this.empId);
            System.out.println("Designation is "+this.designation);
            System.out.println("Salary is "+this.salary);
    }
}
