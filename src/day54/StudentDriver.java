package day54;

import day43.Student;

import java.util.Scanner;

public class StudentDriver {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = sc.nextLine();
        System.out.println("Enter Chemistry marks");
        int chemistryMarks = sc.nextInt();
        System.out.println("Enter Math marks");
        int mathMarks = sc.nextInt();
        System.out.println("Enter Physics marks");
        int physicsMarks = sc.nextInt();

        calculateGrade(mathMarks, physicsMarks, chemistryMarks);
    }

    private static void calculateGrade(int mathMarks, int physicsMarks, int chemistryMarks) {
        int totalMarks = 300;
        int obtainMarks = mathMarks+ physicsMarks+ chemistryMarks;
        double percentage = ((double) obtainMarks / totalMarks) * 100.0;
    }
}
