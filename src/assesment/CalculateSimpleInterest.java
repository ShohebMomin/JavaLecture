package assesment;

import java.util.Scanner;

public class CalculateSimpleInterest {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle amount");
        int principleamount = sc.nextInt();
        System.out.println("Enter rate of interest");
        double rateOfInterest = sc.nextDouble();
        System.out.println("Enter Years");
        int time = sc.nextInt();
        double simpleInterest =  calculateSimpleInterest(principleamount, rateOfInterest, time);
        System.out.println("Simple Interest is: " + simpleInterest);
    }

    private static double calculateSimpleInterest(int principleamount, double rateOfInterest, int time) {
        return principleamount * rateOfInterest*time /100;
    }
}
