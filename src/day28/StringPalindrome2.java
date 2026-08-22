package day28;


public class StringPalindrome2 {
    static void main() {
        String str = "A man, A Plan A Canal : Panama";
        str=str.toLowerCase(); //amanaplanacanalpanama
        System.out.println(str);
        str=str.replaceAll("[^A-Za-z]","");
        System.out.println(str);
        System.out.println(checkPalindrome(str)?"Palindrome":"Not Palindrome");
    }
    public static boolean checkPalindrome(String str){
        int first = 0;
        int last = str.length()-1;
        while(first<last){
            if(str.charAt(first) != str.charAt(last)){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}
