package day2;

public class FunctionScenario3 {
    public static void main(String[] args){ //common man
        int length = 20; // buy
        int breadth = 5; // buy
        int area = areaRect(length, breadth);// call
        System.out.println(area); // serve
    }
    public static int areaRect(int length, int breadth){ //dishonest caters
        int area;
        area = length * breadth;
        return area;
    }
}
