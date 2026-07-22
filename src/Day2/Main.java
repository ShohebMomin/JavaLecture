//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("I am in Main");
        brazil();
        System.out.println("I am finally back in main");
    }
    public static void brazil(){
        System.out.println("I am in brazil ");
        france();
        System.out.println("I am back in brazil");

    }
    public static void france(){
        System.out.println("I am in france");
    }
}