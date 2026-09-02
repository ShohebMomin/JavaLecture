package day43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo5 {
    static void main() {
        List<String> fruits = new ArrayList<>(Arrays.asList("Apple","Banana","Mango"));
        System.out.println(fruits);
        fruits.add("Pineapple");
        System.out.println(fruits);
    }
}
