package day41;

import java.util.ArrayList;
import java.util.Vector;

public class CollectionDemo {
    static void main() {
        Vector vector = new Vector(); //NoArgsConstructor // default capacity = 10 default increment = double // java 1.0
        System.out.println("CAPACITY " +vector.capacity());
        System.out.println("SIZE " +vector.size());
        vector.add(10);
        vector.add("Alice");
        vector.add(true);
        vector.add(10.0);
        System.out.println(vector);

        ArrayList a1 = new ArrayList();
        a1.add(10);
        System.out.println(a1.get(1));
    }
}
