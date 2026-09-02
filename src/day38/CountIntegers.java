package day38;

public class CountIntegers {
    static void main() {
        String s1 = "My name is Alice I have 2 brothers and 3 sisters and Alice age is 13";
        System.out.println(countInteger(s1));
    }
    private static int countInteger(String s1) {
        int count = 0;
        boolean isPreviousDigit = false;
        for (int i = 0; i < s1.length(); i++) {
            if (Character.isDigit(s1.charAt(i))) {
                if (!isPreviousDigit) {
                    count++;
                    isPreviousDigit = true;
                }
            } else {
                isPreviousDigit = false;
            }
        }
        return count;
    }
}