import java.util.Scanner;

public class KmToMeterScenario3 {
    public static void main(String[] args){// common man
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter KM");
        double km = sc.nextDouble();
        double meter = meterConversion(km);
        System.out.println(km+ "km converted into "+ meter+ "meter.");
    }
    public static double meterConversion(double km){//disHonest caterers

        double meter;
        meter= km*1000;
        return meter;
    }
}
