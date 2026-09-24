package day49;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Juicer {
    static void main() {
        int orangeJuice=5;     //5;
        int mangoJuice=4;      //4;
        int appleJuice=4;      //4;

        int minTime=prepareOrder(orangeJuice,mangoJuice,appleJuice);
        System.out.println(minTime);
    }

    private static int prepareOrder(int orangeJuice, int mangoJuice, int appleJuice) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(orangeJuice);
        pq.add(mangoJuice);
        pq.add(appleJuice);

        Iterator<Integer> itr = pq.iterator();
        int sec = 0;
        while (!pq.isEmpty()){
            int j1 = 0;
            int j2 = 0;

            j1 = pq.remove();

            if(itr.hasNext()){
                j2 = pq.remove();
            }

            if(j1>0 && j2 == 0){
                sec+= j1;
                break;
            }

            if (j1 > 0 && j2 > 0) {
                sec++;
                j1--;
                j2--;
            }

            if(j1>0){
                pq.add(j1);
            }
            if(j2>0){
                pq.add(j2);
            }
        }
        return sec;
    }
}
