package practice;

public class WrapperClass {
    static void main() {
        String a = "15";
        String s = "Shoaib";
        boolean b = true;
        double d = 9.3;
        float f = 2.3F;
        long l = 3029102L;
        char ch = 'S';
        byte by = 1;

        System.out.println("Primitive values");
        System.out.println(a);
        System.out.println(s);
        System.out.println(b);
        System.out.println(d);
        System.out.println(f);
        System.out.println(l);
        System.out.println(ch);
        System.out.println(by);

        // Converts a String into its corresponding primitive type
        int hundred = Integer.parseInt("100");
        System.out.println(hundred + 5);
        Integer ten = 10;
        System.out.println(ten + ten);
        int tenN = ten + ten;
        System.out.println(tenN);
        String tenString = Integer.toString(10);
        System.out.println(tenString + 20);

    }


}
