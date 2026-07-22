//Call by Value Examples
public class CallByValueExample {
    public static void main(String[] args){
        int a = 120;
        System.out.println(a);
        test(a);
        System.out.println(a);
    }
    public static void test(int b){
        System.out.println(b);
        b = 99;
        System.out.println(b);
    }
}