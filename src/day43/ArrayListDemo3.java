package day43;

import java.util.ArrayList;

public class ArrayListDemo3 {
    static void main() {
        ArrayList<Student> s1 = new ArrayList<>();
        s1.add(new Student(23,"Ben",69.33));
        s1.add(new Student(25,"Ken",78.33));
        s1.add(new Student(20,"Zain",61.33));

        System.out.println(s1.get(2).getStudentName());
    }
}
