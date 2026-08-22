package day34;

public class AnimalDriver {
    static void main() {
        Animal h1 = new Horse();
        h1.eat();
        h1.sleep();
        h1.run();

        Animal t1 = new BengalTiger();
        t1.eat();
        t1.sleep();
        t1.run();
    }
}
