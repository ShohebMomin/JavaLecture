package day18;
import java.util.Scanner;
public class ArrayPractice {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Working days");
            int workingDays = sc.nextInt();
            int targetArr[]= new int[workingDays];
            for (int i =0; i<workingDays; i++){
            System.out.println("Enter your earning on day " +(i+1));
                targetArr[i] = sc.nextInt();
            }
            System.out.println("Enter number of Targets");
            int numberOfTargets = sc.nextInt();
            calculate(targetArr, numberOfTargets);
        }
        public static void calculate(int[] targetArr, int numberOfTargets){
                Scanner sc = new Scanner(System.in);
                boolean flag = true;
            for (int i = 0; i<numberOfTargets; i++){
                int sum = 0;
                System.out.println("Enter "+ (i+1)+"'s target!"); //[500,700,1000,600,1200,1500,1300]
                int target = sc.nextInt();
                for (int j=0; j<targetArr.length;j++){
                sum += targetArr[j];
                if (sum>= target){
                    System.out.println("target achieved in " + (j+1)+" days!");
                    flag=false;
                    break;
                }
                }
            if (flag)System.out.println("Target is impossible to achieve! ");
            }

        }
    }


