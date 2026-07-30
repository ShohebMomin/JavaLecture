package day18;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayPracticeDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of working days");
        int workingDays = sc.nextInt();
        int income[] = new int[workingDays];
        for (int i = 0; i<workingDays; i++){
            System.out.println("Enter your earning on day"+ (i+1));
          income[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(income));
        System.out.println("Enter how many targets you have to achieve");
        int targets = sc.nextInt();
        int sum = 0;
        int currentDay =0;
    calculateTarget(income, targets, sum, currentDay);
    }

    public static void calculateTarget(int income[],int targets, int sum, int currentDay){
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i<=targets; i++) {
            boolean targetAchieved = false;
            System.out.println("Enter target no." + (i)); //2000 //20
            int targetToAchieve = sc.nextInt(); // 2000 //20
            for (int j = currentDay; j < income.length; j++) { //[500,600,400,500]
                sum += income[j]; //2000 //0
                if (sum >= targetToAchieve) { //is 2000>= 2000  true
                    System.out.println("Target is achieved in " + (j + 1) + " days!"); //j=3 +1 = 4days
                    sum = sum - targetToAchieve; //2000 - 2000 = 0
//                    System.out.println(sum);
                    currentDay = j + 1; // k=4
                    targetAchieved = true;
                    break;
                }
            }

            if (!targetAchieved) {
                System.out.println("Target is impossible to achieve");
                currentDay = income.length;
                sum = 0;
            }
        }
    }
}