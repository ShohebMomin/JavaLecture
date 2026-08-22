package day33;

public class DemoMain {
    static void main() {
        Amitabh a1 = new Amitabh();
        a1.home();

        Amitabh b1;  // parent reference
        b1 = new Abhishek(); // child object
        b1.home();

        Abhishek a2;
        a2 = new Abhishek();
        a2.car();
        a2.home();

        Aradhya a3;
        a3 = new Aradhya();
        a3.office();
        a3.car();
        a3.home();
    }
}
