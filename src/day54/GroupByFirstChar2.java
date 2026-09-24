package day54;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroupByFirstChar2 {
    static void main() {
        String sentence = "Shoaib Harsh Faizan Prajwal Rutuja Sakshi Akshata Sumedh Raj Faraz";

        Map<Character, ArrayList<String>> hashMap = new HashMap<>();

        String[] words = sentence.split(" ");
        for (String word: words){
            char key = word.charAt(0);
            hashMap.putIfAbsent(key, new ArrayList<>());
            hashMap.get(key).add(word);
        }
        System.out.println(hashMap);
    }

}
