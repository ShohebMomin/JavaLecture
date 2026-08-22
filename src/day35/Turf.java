package day35;

import java.util.Scanner;

public class Turf {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int cricketPrise = 700;
        int footballPrise = 1000;
        String name;
        String time;
        int playHours;
        String date;
        int choice;
        System.out.println("Enter Your Name");
        name = sc.nextLine();
        System.out.println("Enter Date [dd-mm-yy]");
        date = sc.nextLine();
        System.out.println("choose Your time of play [24 Hours format]");
        time =sc.next();
        System.out.println("Enter how many hours you want to play");
        playHours = sc.nextInt();
        System.out.println("Choose Turf");
        System.out.println("For Cricket Enter 1");
        System.out.println("For Football Enter 2");
        System.out.println("For Football Exit 0");
        choice = sc.nextInt();
        printBill(name, time,playHours,date,time,playHours,choice,cricketPrise,footballPrise);
    }

    private static void printBill(String name, String time, int playHours, String date, String time1, int playHours1, int choice,int cricketPrise, int footballPrise) {
        String turfType = "";
        int totalAmount = 0;
        switch (choice){
            case 1:
                turfType = "Cricket Turf";
                totalAmount = playHours*cricketPrise;
                break;
            case 2:
                totalAmount = playHours*footballPrise;
                turfType = "Football Turf";
                break;
            case 3:
                System.exit(0);
        }
        System.out.println("***ABC Turf***");
        System.out.println("Name : " + name);
        System.out.println("Date : " + date);
        System.out.println("Time: " + time);
        System.out.println("Play Hours : " + playHours);
        System.out.println("Turf type : " + turfType);
        System.out.println("Total Bill : " + totalAmount);
    }
}
