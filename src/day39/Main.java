package day39;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    String name;
    String city ;
    String email;
    int id;
    long phoneNumber;
    static void main() {

    }
    void acceptCustomer(){
        System.out.println("Enter customer name");
        name = sc.nextLine();
        System.out.println("Enter customer city");
        city = sc.nextLine();
        System.out.println("Enter customer email id");
        email = sc.next();
        System.out.println("Enter customer phone number");
        phoneNumber = sc.nextLong();
        System.out.println("Enter customer id");
        id = sc.nextInt();
    }


}
