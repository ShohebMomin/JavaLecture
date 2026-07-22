import java.util.Scanner;

public class ForLoopDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= 3; i++){                                // i                         per       output
            System.out.println("Enter your HSC percentage!");       // 1    is 1 <= 3 true        76.3     enter your hsc percentage!  //
            int per = sc.nextInt();                                 // 2    IS 2<= 3 true
            if(per>= 35.5){                                         // 3    is 3<=3  true
                System.out.println("Congratulations");
                System.out.println("Passed");
            }else {
                System.out.println("Fail");
            }
        }
        System.out.println("All the best");
    }
}
