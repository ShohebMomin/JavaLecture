package day31;

import java.util.Scanner;

public class DriverSupplier {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Supplier Name");
        String name = sc.nextLine();
        System.out.println("Enter Supplier Id");
        int id = sc.nextInt();
        System.out.println("Enter City Name");
        String city = sc.next();
        System.out.println("Enter Supplier Email");
        String email = sc.next();
        System.out.println("Enter Supplier Contact");
        Long contact = sc.nextLong();
        System.out.println("Enter is COD Available");
        boolean isCodAccept = sc.nextBoolean();

        Supplier s1 = new Supplier(name, id, city, email,contact,isCodAccept);
        s1.displaySupplier();
    }
}
