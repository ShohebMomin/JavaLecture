package day28;

public class StringPalindrome {
    static void main() {
        String str = "nitin";
        if(checkPalindrome(str)){
            System.out.println(str + " is palindrome");
        }else{
            System.out.println(str+" is not a palindrome");
        }

    }

    private static boolean checkPalindrome(String str) {
        int first = 0;
        int last = str.length()-1;
        while (first<last){
            if(str.charAt(first) != str.charAt(last)){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}
