package assesment;

import java.util.Scanner;

public class CalculateGrossSalary {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic Salary");
        int basicSalary = sc.nextInt();
        int dA = calculateDA(basicSalary);
        int hRA = calculateHRA(basicSalary);
        System.out.println("Gross Salary is " + (basicSalary+ dA+hRA));
    }

    public static int calculateDA(int basicSalary) {
        return basicSalary * 20 / 100;
    }

    public static int calculateHRA(int basicSalary) {
        return basicSalary * 30 / 100;
    }

}