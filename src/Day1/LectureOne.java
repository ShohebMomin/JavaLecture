package day1;

public class LectureOne {
    public static void main(String[] args){
        int age = 19;
        System.out.println("My age is "+ age);

        // Data type conversion
        // int --------> double
        // 4bytes ----> 8bytes there is no data loss
        // this is called widening
        // example for widening data type conversion
//        int propertyValue = 10;
//        System.out.println("I want to sale my property for " + propertyValue + " crores");
//        double newsPaperPrintingPropertyValue = propertyValue;
//        System.out.println("Newspaper add to sale my property for " + newsPaperPrintingPropertyValue + " crores");

//        Example for narrowing data type conversion
        double propertyValue = 9.75;
        System.out.println("I want to sale my property for " + propertyValue + " crores");
        int newsPaperPrintingPropertyValue =(int) propertyValue;
        System.out.println("Newspaper add to sale my property for " + newsPaperPrintingPropertyValue + " crores");

    }
}
