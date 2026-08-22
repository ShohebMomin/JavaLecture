package day23;

public class FactorialUsingIteration {
    static void main() {
        int n =5;
//        using iteration
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}