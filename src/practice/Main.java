package practice;

import java.util.Scanner;

public class Main {
    static void main() {
    Scanner sc = new Scanner(System.in);
        String customerName;
        String dateOfPlay;
        String timeOfPlay;
        int numberOfHours;
        int choice;

        System.out.println("***ABC Turf***");

        System.out.println("Enter Your Name");
        customerName = sc.nextLine();

        System.out.println("Enter Date of Play [dd-mm-yy]");
        dateOfPlay = sc.next();

        System.out.println("Enter Time of Play [24 hours format]");
        timeOfPlay= sc.next();

        System.out.println("For How many Hours you want to book a Turf");
        numberOfHours = sc.nextInt();

        System.out.println("Choose Turf Type");
        System.out.println("1 : Cricket Turf");
        System.out.println("2 : Football Turf");
        System.out.println("3 : Exit");
        choice = sc.nextInt();

        Turf turf = TurfManager.bookTurf(choice);
        PrintBill.billPrint(customerName,dateOfPlay,timeOfPlay,numberOfHours, turf);
    }
}
