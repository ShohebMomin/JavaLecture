package collectionrevision.day3;

import java.util.*;

public class IteratorDemo {
    static void main() {
        List<String> kotibhaskar = new ArrayList<>(Arrays.asList("Jan", "Feb", "March", "April", "May"));
        Iterator<String> iterator = kotibhaskar.iterator();
//        Iterator<String> iterator = kotibhaskar.listIterator();
        ListIterator<String> lift = kotibhaskar.listIterator();

        while (lift.hasNext()){
            String month = lift.next();
            if(month.length()>4) {
                lift.add("Apple");
            }
        }
        System.out.println(kotibhaskar);
    }
}
