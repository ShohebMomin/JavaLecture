import java.util.Scanner;

public class TemperatureConverstionScenario2 {
    public static void main(String[] args){
        double temp = tempConversion();
        System.out.println("the temperature is " +temp+"F");
    }
    public static double tempConversion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature in Celsius");
        double celsius = sc.nextDouble();
        double tempFahrenheit;
        tempFahrenheit = (celsius * 1.8) + 32;
        return tempFahrenheit;
    }
}
