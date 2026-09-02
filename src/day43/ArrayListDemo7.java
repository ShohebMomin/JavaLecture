package day43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo7 {
    static void main() {
        List<String> maharashtra = new ArrayList<>(Arrays.asList("Pune", "Mumbai", "Nagpur"));
        List<String> rajasthan = new ArrayList<>(Arrays.asList("Jaipur", "Fatehpur", "Bikaner"));
        List<String> India = new ArrayList<>();
        India.addAll(maharashtra);
        India.addAll(rajasthan);
        System.out.println(maharashtra);
        System.out.println(rajasthan);
        System.out.println(India);

        System.out.println(maharashtra.size());
        System.out.println(rajasthan.size());
        System.out.println(India.size());

        System.out.println(India.get(0));
        System.out.println(India.get(4));
    }
}