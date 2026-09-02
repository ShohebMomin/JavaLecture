package day43;

import java.util.ArrayList;

public class ArrayListDemo2 {
    static void main() {
        ArrayList<String> a1 = new ArrayList<>();
        //homogenous
        //explicit type casting not required
        //restriction : same type
        a1.add("Alice");
        a1.add("Ben");
        a1.add("Chris");
        String name  = a1.get(0);
        System.out.println(name);
    }
}
