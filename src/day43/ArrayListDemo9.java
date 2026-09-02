package day43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo9 {
    static void main() {
        Student st1 = new Student(1,"Alice",99.9);
        Student st2 = new Student(2,"Ben",89.9);
        Student st3 = new Student(3,"Jen",78.9);
        ArrayList<Student> firstYear = new ArrayList<>(Arrays.asList(st1,st2,st3));

        Student st4 = new Student(4,"Rajesh",48.8);
        Student st5 = new Student(5,"Karan",58.8);
        Student st6 = new Student(3,"Jen",79.8);
        ArrayList<Student> secondYear = new ArrayList<>(Arrays.asList(st4,st5,st6));

        List<List<Student>> bTech= new ArrayList<>();
        bTech.add(firstYear);
        bTech.add(secondYear);

        System.out.println(bTech.get(1).get(2).getStudentName());
        int totalPerSum = 0;
        for (Student student: bTech.get(0)){
            System.out.println(student.getStudentName());
            totalPerSum+= student.getPer();
        }
        System.out.println("First year students sum of per: "+ totalPerSum);
        System.out.println("First year students avg percentage is : "+ totalPerSum/bTech.get(0).size());

    }
}
