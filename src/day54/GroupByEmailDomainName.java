package day54;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GroupByEmailDomainName {
    static void main() {
        String sentence = "arjun.patil@example.com neha.sharma@gmail.com rohan.verma@yahoo.com priya.joshi@outlook.com amit.kulkarni@example.com sneha.pawar@gmail.com vikram.shinde@yahoo.com rahul.deshmukh@outlook.com pooja.kale@example.com karan.mehra@gmail.com ananya.gupta@yahoo.com aditya.singh@outlook.com nikhil.jadhav@example.com simran.kaur@gmail.com rohit.mane@example.com";

        Map<String, ArrayList<String>> hashMap = new HashMap<>();

        String[] emails = sentence.split(" ");
//        System.out.println(Arrays.toString(emails));
        for(String email: emails){
//            System.out.println(email.indexOf('@'));
            String domain = email.substring(email.indexOf("@")+1);
            hashMap.putIfAbsent(domain, new ArrayList<>());
            hashMap.get(domain).add(email);
        }
        System.out.println(hashMap);
    }
}
