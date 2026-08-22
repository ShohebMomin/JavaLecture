package day33;

public class Account extends Person{
   String accountType = "Saving";
   String branch = "Kothrud";
   long accountNumber = 6218382314L;
   public Account(){}
   void displayAccount(){
       System.out.println(accountType);
       System.out.println(branch);
       System.out.println(accountNumber);
   }
}
