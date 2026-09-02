package day37;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RoomDecoration {
    static void main() {
        try {
        double carpetCost=calculateTotalCarpetCost();
        System.out.println("Total Expenses of Carpet is " + carpetCost);

        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static double calculateTotalCarpetCost() throws RuntimeException{
        try {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter per sq ft carper cost");
        int carpetSqrftCost = sc.nextInt();
        Room room;

        System.out.println("Enter Room length");
        int length = sc.nextInt();
        System.out.println("Enter room width");
        int width = sc.nextInt();
        room = new Room(length, width);
        return room.getWidth()*carpetSqrftCost;
        }
        catch (InputMismatchException ex){
            System.out.println("Log : Message for Developer Please enter valid integer values only");
            throw new RuntimeException("Message for customer, plz try after sometime");
        }
        catch (NullPointerException ex){
            ex.printStackTrace();
            throw new RuntimeException("Message for Customer , Pls try after sometime");
        }
    }
}
