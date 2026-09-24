package day53;

import java.util.*;

public class GroupWordsByLength {
    static void main() {
        String sentence = "one two three four five six seven eight nine ten";

        Map<Integer, List<String>> hashMap = new HashMap<>();
        String[] words = sentence.split(" ");
       for(String word: words){
          int key = word.length();
          hashMap.putIfAbsent(key, new ArrayList<>());

          hashMap.get(key).add(word);
       }
        System.out.println(hashMap.values());

    }
}
