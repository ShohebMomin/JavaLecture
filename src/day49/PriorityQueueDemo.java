package day49;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    static void main() {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(Arrays.asList(8,2,3,7,1,6));
        while (pq.size()> 1){
            Integer s1 = pq.remove();
            Integer s2  = pq.remove();
            Integer remains = s1 - s2;
            pq.add(remains);
        }
            System.out.println(pq);
        if (pq.size() == 1){
            System.out.println("Stone in the bag is " + pq.peek() + "kg");
        }else {
            System.out.println("no stone left");
        }
    }
}
