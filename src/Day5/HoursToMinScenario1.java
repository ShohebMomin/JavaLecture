package day5;

import java.util.Scanner;

public class HoursToMinScenario1 {
    public static void main(String[] args){// ambani
        hoursConversion();
    }
    public static void hoursConversion(){//hotel
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hours");
        double hr = sc.nextDouble();
        double minutes = hr*60;
        System.out.println(hr+ "Hours converted into "+ minutes+ "Minutes.");
    }
}
