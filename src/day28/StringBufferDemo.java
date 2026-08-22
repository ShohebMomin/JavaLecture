package day28;
// It reserves room for 16 characters without reallocation.
// it accepts an integer argument that explicitly sets the size of the buffer.
// it accepts a string argument that sets the intial contents of the StringBuffer object and reverses room
// for 15 more characters without reallocation.

public class StringBufferDemo {
    static void main() {
        //1. Using default constructor
        StringBuffer sb1 = new StringBuffer();
        sb1.append("hello");
        System.out.println("Default Constructor " + sb1);

        //2. using constructor with specified capacity
        StringBuffer sb2 = new StringBuffer(50);
        sb2.append("Java Programming");
        System.out.println("with capacity 50 : " + sb2);

        //3. using constructor with string
        StringBuffer sb3 = new StringBuffer("wellcome");
        sb3.append(" to java");
        System.out.println("with string: "+sb3);
    }

}
