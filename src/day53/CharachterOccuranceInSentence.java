package day53;

import java.util.HashMap;
import java.util.Map;

public class CharachterOccuranceInSentence {
    static void main() {
        String word = "java";
        Map<Character, Integer> hashMap = new HashMap<>();
        for(char key: word.toCharArray()){
            if (hashMap.containsKey(key)){
                hashMap.put(key, hashMap.get(key) +1);
            }else {
                hashMap.put(key, 1);
            }
        }
        System.out.println(hashMap);

        for(char key : word.toCharArray()){
            if(hashMap.get(key)==1)
                System.out.println(hashMap.get(key));
        }
    }
}
