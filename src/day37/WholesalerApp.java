package day37;

import java.util.Scanner;

public class WholesalerApp {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter quantity");
        int quantity = sc.nextInt();
        quantityValidator(quantity);
    }

    private static void quantityValidator(int quantity) {
        try {
        if(quantity<500)
            throw new InvalidQuantityException("Pls Enter quantity greater than 500");
        System.out.println("Order Accepted");

        }catch (InvalidQuantityException ex){
            System.out.println(ex.getMessage());
        }
    }
}
