package assesment;

public class SwapTwoVariables {
    static void main() {
        int A = 10;
        int B = 20;
        System.out.println("Before Swapping A"+ A + " B" + B);
        int temp = A;
        A=B;
        B=A;
        System.out.println("After Swapping A"+ A + " B" + B);
    }
}
