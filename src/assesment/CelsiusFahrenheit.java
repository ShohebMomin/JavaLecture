package assesment;

import java.util.Scanner;

public class CelsiusFahrenheit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Celsius  Temperature");
        int celsius = sc.nextInt();
        int fahrenheit = convertCelciusToFahrenheit(celsius);
        System.out.println(celsius+"°C in Fahrenheit is "  + fahrenheit+ "°F");
    }

    private static int convertCelciusToFahrenheit(int celsius) {
        return (celsius*9/5) + 32;
    }
}
