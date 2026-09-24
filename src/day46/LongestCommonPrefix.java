package day46;

public class LongestCommonPrefix {
    static void main() {
        String arr[] = {"Flower", "Flower", "Flower"};
        System.out.println(findLongestCommonPrefix(arr));
    }

    private static String findLongestCommonPrefix(String[] arr) {
        String prefix = arr[0];
        for (int i  =0 ; i< arr.length; i++){
            while (!arr[i].contains(prefix)){
                prefix = prefix.substring(0, prefix.length() -1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }
}
