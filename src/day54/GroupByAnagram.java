package day54;

import day16.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GroupByAnagram {
    static void main() {
        String sentence = "silent listen note tone enot bca abc cab apple mango";

        Map<String, ArrayList<String>> hashMap = new HashMap<>();

        String[] words = sentence.split(" ");

        for(String word: words){
            char arr[] = word.toCharArray();
            Arrays.sort(arr);
            String sortedWord = new String(arr);
            hashMap.putIfAbsent(sortedWord, new ArrayList<>());
            hashMap.get(sortedWord).add(word);
        }
        System.out.println(hashMap.values());
    }
}
