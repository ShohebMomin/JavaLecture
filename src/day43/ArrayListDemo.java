package day43;

import java.util.ArrayList;

public class ArrayListDemo {
    static void main() {
        ArrayList a1 = new ArrayList(); // heterogeneous
        a1.add(1);
        a1.add("Alice");
        a1.add(true);
        a1.add(new Student(43,"Ben",45.5));
        String name = (String)a1.get(0);
        String rno = (String) a1.get(1);
        Student stud1  = (Student) a1.get(2);
        System.out.println(((Student) a1.get(3)).getStudentName());
    }
}
