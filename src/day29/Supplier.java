package day29;

import java.util.Scanner;

public class Supplier {
   private int id;
   private String name;
   private String city;
   private String email;
   private Long contact;
   private boolean isCodAccept;

   public void displaySupplier(){
       System.out.println("Supplier Name: " + name);
       System.out.println("Supplier id: " + id);
       System.out.println("Supplier city: " + city);
       System.out.println("Supplier email: " + email);
       System.out.println("Supplier contact: " + contact);
       System.out.println("Supplier is COD Available: " + isCodAccept);
   }

   public void acceptSupplier(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Supplier Name");
       name = sc.nextLine();
       System.out.println("Enter Supplier Id");
       id = sc.nextInt();
       System.out.println("Enter City Name");
       city = sc.next();
       System.out.println("Enter Supplier Email");
       email = sc.next();
       System.out.println("Enter Supplier Contact");
       contact = sc.nextLong();
       System.out.println("Enter is COD Available");
       isCodAccept = sc.nextBoolean();
   }
   public void test(){
       Supplier s2 = new Supplier();
       System.out.println(s2.id);
   }
}
