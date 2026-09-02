package day43;

import java.util.Vector;

public class ArrayListDemo4 {
    static void main() {
        Vector student1 = new Vector();
        student1.add(new Student(54,"David",100.0));
        student1.add(new Student(54,"Jen",99.9));
        student1.add(new Student(54,"Peter",90.9));

        System.out.println(student1.getLast());
    }
}
