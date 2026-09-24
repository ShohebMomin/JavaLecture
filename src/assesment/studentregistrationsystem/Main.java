package assesment.studentregistrationsystem;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rollNumber ;
        String name ;
        String course ;
        int marks ;
        List<Student> students = new ArrayList<>();

        int choose=0;
        do{
           try {
                System.out.println("Register Student");
                System.out.println("Choose 1 to add student ");
                System.out.println("Choose 0 to exit");
                choose = sc.nextInt();
            }catch (InputMismatchException e){
               System.out.println("Please Enter Valid number and Try again");
           }
            if(choose == 1) {
                try {
                    System.out.println("Enter Roll Number");
                    rollNumber = sc.nextInt();

                    System.out.println("Enter Name");
                    name = sc.next();

                    System.out.println("Enter course");
                    course = sc.next();

                    System.out.println("Enter Marks");
                    marks = sc.nextInt();
                    Student s1 = new Student(rollNumber, name, course, marks);
                    students.add(s1);
                    System.out.println("Student Registered Successfully");
                }catch (InputMismatchException e){
                    System.out.println("Please Enter Valid Inputs and try again");
                }
            }
        }
        while (choose == 1);

        for(Student student: students){
            System.out.println(student);
        }
        System.out.println("Total Number of Students " + students.size());

    }
}
