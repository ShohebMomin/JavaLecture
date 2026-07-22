import java.util.Scanner;

public class HoursToMinScenario2 {
    public static void main(String[] args){// ambani
        double minutes = hoursConversion();
        System.out.println("Hours converted into "+ minutes+ "Minutes.");
    }
    public static double hoursConversion(){//hotel
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hours");
        double hr = sc.nextDouble();
        double minutes;
        minutes = hr*60;
        return minutes;
    }
}
