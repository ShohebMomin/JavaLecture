package day43;

import day16.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo8 {
    static void main() {
        ArrayList<String> maharashtra = new ArrayList<>(Arrays.asList("Pune", "Mumbai", "Jalna"));
        ArrayList<String> rajasthan = new ArrayList<>(Arrays.asList("Jaipur", "Bikaner", "Fatehpur"));

        List<List<String>> India = new ArrayList<>();
        India.add(maharashtra);
        India.add(rajasthan);

        System.out.println(India.get(1).get(2));
        System.out.println(India.get(0).get(1));

    }
}
