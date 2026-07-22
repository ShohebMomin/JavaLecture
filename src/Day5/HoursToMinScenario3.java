import java.util.Scanner;

public class HoursToMinScenario3 {
    public static void main(String[] args){// common man
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hours");
        int hr = sc.nextInt();
        int minutes = hoursConversion(hr);
        System.out.println(hr+ " Hours converted into "+ minutes+ " Minutes.");
    }
    public static int hoursConversion(int hr){//dishonest caterers


        int minutes;
        minutes = hr*60;

        return minutes;

    }
}
