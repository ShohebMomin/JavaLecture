package day9;

public class OneTo1000ArmstrongNumbers {
    public static void main(String[] args) {
        armstrongNumber();
    }
    public static void armstrongNumber(){
        int iteration = 1000;
        int rem;
        for(int i = 1; i<=iteration; i++) {
        int sum=0;
            int num = i;
            while(num>0){
                rem = num % 10;
                sum = sum + (rem * rem * rem);
                num = num / 10;
            }
            if (i == sum) {
                System.out.println(i + "is Armstrong Number");
            }
        }
    }
}
