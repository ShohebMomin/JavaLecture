import java.util.Scanner;

public class TemperatureConversionScenario1 {
    public static void main(String[] args){
        tempConversion(); // 
    }
    public static void tempConversion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature in Celsius");
        double celsius = sc.nextDouble();
        double tempFahrenheit = (celsius * 1.8) + 32;
        System.out.println("the temperature is " +tempFahrenheit+"F");
    }
}
