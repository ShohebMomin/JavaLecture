package day19;

import java.util.Scanner;

public class ArrayPractice1 {
   public static void main(String[] args){
       Scanner sc =new Scanner(System.in);
       int currency[] = {500,200,100,50,20,10};
       System.out.println("Enter Currency");
       int amount = sc.nextInt();
       calculate(currency, amount);
   }
   public static void calculate(int currency[],int amount){ //6750
       int notes[]= new int[currency.length];
       int totalNotes =0;
       for(int i = 0; i<currency.length; i++){ //
            notes[i] = amount/currency[i];
            amount = amount%currency[i];
       }
       for(int j = 0 ; j<notes.length;j++){
           if(notes[j] !=0) System.out.println(currency[j]+ " x " + notes[j]);
       }
   }

}
