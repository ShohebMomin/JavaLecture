package day28;

public class LargestWordFromSentance {
    static void main() {
        String name = "Virat kohli plays Cricket for rcb";
        String words[]=name.split(" ");
        System.out.println("number of words is " + words.length);
        largestNumber(words);
        smallestNumber(words);
    }
    public static void largestNumber(String words[]){
        String largest = words[0];
        for(int i = 1; i<words.length; i++){
            if(words[i].length() >=  largest.length()){
                largest = words[i];
            }
        }
        System.out.println("Largest word is: " + largest);
    }
    public static void smallestNumber(String words[]){
        String smallest = words[0];
        for(int i = 1; i<words.length; i++){
            if(words[i].length() <  smallest.length()){
                smallest = words[i];
            }
        }
        System.out.println("the smallest word is: " + smallest);
    }

}
