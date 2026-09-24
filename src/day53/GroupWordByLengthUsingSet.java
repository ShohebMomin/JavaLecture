package day53;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GroupWordByLengthUsingSet {
    static void main() {
        String sentence = "one one two three four five six seven eight nine ten";
        String[] words = sentence.split(" ");
        Map<Integer, Set<String>> hashmap = new HashMap<>();

        for(String word : words){
            int key = word.length();
            hashmap.putIfAbsent(key, new HashSet<>());
            hashmap.get(key).add(word);
        }
        System.out.println(hashmap.values());
    }
}
