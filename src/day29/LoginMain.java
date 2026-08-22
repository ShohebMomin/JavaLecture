package day29;

import java.util.Scanner;

public class LoginMain {
    static void main() {
        Scanner sc =new Scanner(System.in);

        Login l1 = new Login();

        System.out.println("Enter Your UserName");
        l1.setUsername(sc.next());

        System.out.println("Enter Your Password");
        l1.setPassword(sc.next());

        System.out.println(l1.getUsername());
        System.out.println(l1.getPassword());
    }
}

