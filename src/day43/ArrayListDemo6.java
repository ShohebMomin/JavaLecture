package day43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo6 {
    static void main() {
        Student student1 = new Student(1, "Alice", 99.9);
        Student student2 = new Student(2, "Gen",98.2);
        Student student3 = new Student(3, "Ben", 95.3);

        List<Student> students = new ArrayList<>(Arrays.asList(student1, student2, student3));
        System.out.println(students);
    }
}
