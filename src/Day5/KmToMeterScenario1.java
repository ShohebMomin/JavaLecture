import java.util.Scanner;

public class KmToMeterScenario1 {
    public static void main(String[] args){
        meterConversion();// ambani
    }
    public static void meterConversion(){//hotel
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter KiloMeter");
        double km = sc.nextDouble();
        double meter = km*1000;
        System.out.println(km+ "km converted into "+ meter+ "meter.");
    }
}
