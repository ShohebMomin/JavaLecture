package day5;

import java.util.Scanner;

public class TemperatureConversionScenario3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature in Celsius");
        double celsius = sc.nextDouble();
        double temp = tempConversion(celsius);
        System.out.println("the temperature is " +temp+"F");

    }
    public static double tempConversion(double celsius){// dishonest caterers

        double tempFahrenheit;
        tempFahrenheit = (celsius * 1.8) + 32;
        return tempFahrenheit;
    }
}
