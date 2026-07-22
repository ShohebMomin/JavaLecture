import java.util.Scanner;

public class LogicalOperators3 {
    public static void main(String[] args) {
        int gender;
        int age;
        int qualification;
        int salary;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Gender [0-Female, 1-Male");
        gender = sc.nextInt();
        System.out.println("Enter Your Age.");
        age = sc.nextInt();
        System.out.println("Enter Your qualification [1-Post Graduation and more. 2- Graduation. 0-below graduation");
        qualification = sc.nextInt();
        System.out.println("Enter Your Salary");
        salary = sc.nextInt();
        if((gender == 1 && age <30 && qualification ==1 && salary >50000) || (gender ==0 && age<25 && salary > 25000 && (qualification ==2 || qualification ==1))){
            System.out.println("Your are eligible for our policy");
        }else{
            System.out.println("You are not eligible for our policy");
        }
    }
}
