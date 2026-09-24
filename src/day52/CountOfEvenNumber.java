package day52;

import java.util.HashMap;
import java.util.Map;

public class CountOfEvenNumber {
    static void main() {
        int arr[] = {1,2,3,4,5};
        int count = 0;
        for(int i = 0 ; i< arr.length; i++){
            if(arr[i] %2 == 0 ){
                System.out.println(i + " is even");
                count++;
            }
        }
        System.out.println(count+ " is count of even number");
    }

}
