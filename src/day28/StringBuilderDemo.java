package day28;

public class StringBuilderDemo {
    static void main() {
        StringBuilder s1 = new StringBuilder("Shoaib");
        System.out.println("Initial String: " + s1);

        s1.append(" is awesome");
        System.out.println("after append: " +s1);

        StringBuilder sb2 = new StringBuilder();
        sb2.append("hello");
        System.out.println("sb2: " + sb2);

        StringBuilder sb3 = new StringBuilder(50);
        sb3.append("This has initial capacity 50");
        System.out.println("sb3: " + sb3);

        StringBuilder sb4 = new StringBuilder("Geeks");
        sb4.append("ForGeeks");
        System.out.println("sb4: " + sb4);

        CharSequence cs = "Java";
        StringBuilder sb5 = new StringBuilder(cs);
        sb4.append("Programming");
        System.out.println("sb4: " +sb4);
    }
}
