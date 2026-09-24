package assesment;

import java.util.Scanner;

public class AreaAndPerimeterOfCircle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of the circle");
        int radius = sc.nextInt();
        double perimeter =  calculatePerimeter(radius);
        double area = calculateArea(radius);
        System.out.println("Area of circle is: " + area );
        System.out.println("Perimeter of circle is: " + perimeter);
    }

    private static double calculateArea(int radius) {
        return Math.PI*radius*radius;
    }

    private static double calculatePerimeter(int radius) {
        return 2*Math.PI*radius;
    }

}
