// Call by Reference Example
public class CallByReferenceDemo {
    public static void main(String[] args){
        int[] arr = {10,20,30};
        System.out.println(arr[0]);
        test(arr);
        System.out.println(arr[0]);
    }
    public static void test(int[] zrr){
        System.out.println(zrr[0]);
        zrr[0] = 99;
        System.out.println(zrr[0]);
    }
}
