package assesment;

public class SwapTwoVariablesWithoutExtraVar {
    static void main() {
        int A = 10;
        int B = 20;
        System.out.println("Before Swapping A" + A+ " B" + B);
        A = A+B; //30
        B = A-B; //30 - 20 = 10
        A = A-B;

        System.out.println("After Swapping A"+ A + " B" + B);

    }
}
