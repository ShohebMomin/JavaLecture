package day35.turf;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int cricketPrise = 700;
        int footballPrise = 1000;
        String customerName;
        String dateOfPlay;
        int numberOfHours;
        String timeOfPlay;
        int choice;

        System.out.println("Enter Your Name");
        customerName = sc.nextLine();

        System.out.println("Enter Date [dd-mm-yy]");
        dateOfPlay = sc.nextLine();

        System.out.println("Choose Your Time of play [24 Hours format]");
        timeOfPlay =sc.next();

        System.out.println("Enter how many hours you want to play");
        numberOfHours = sc.nextInt();

        System.out.println("Choose Turf");
        System.out.println("For Cricket Enter 1");
        System.out.println("For Football Enter 2");
        System.out.println("For Football Exit 0");
        choice = sc.nextInt();

        Turf turf = TurfManager.bookTurf(choice);
        PrintBill.billPrinting(customerName, dateOfPlay,timeOfPlay,numberOfHours,turf);
        // printBill(name, dateOfPlay,numberOfHours,date,time,playHours,choice,cricketPrise,footballPrise);
    }
}
