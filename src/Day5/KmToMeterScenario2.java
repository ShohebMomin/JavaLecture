import java.util.Scanner;

public class KmToMeterScenario2 {
    public static void main(String[] args){
       double meter = meterConversion();// common man
        System.out.println("converted into "+ meter+ "meter.");
    }
    public static double meterConversion(){//honest Caterers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter KiloMeter");
        double km = sc.nextDouble();
        double meter;
        meter= km*1000;
        return meter;
    }
}
