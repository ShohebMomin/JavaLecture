package day37;

import java.util.Scanner;

public class NameValidation {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Name");
        String name = sc.nextLine();
        validateName(name);
    }
   public static void validateName(String name){
        try {
            if (!name.matches("[A-Za-z]+")) {
                throw new InvalidNameException("Please Enter name without any special character and digit");
            }
            System.out.println(name);
        }
        catch (InvalidNameException ex){
            System.out.println(ex.getMessage());
        }
    }
}
