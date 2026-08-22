package day23;

import day9.Factorial;

public class FactorialUsingRecursion {
    static void main() {
        int num = 5;
        int factorial = recursion(5);
        System.out.println(factorial);
    }
    public static int recursion(int n){
        if(n ==1)
            return 1;
        return n*recursion(n-1);
    }
}
