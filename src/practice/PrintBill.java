package practice;

public class PrintBill {
    public static void billPrint(String customerName, String dateOfPlay, String timeOfPlay, int numberOfHours, Turf turf){
        System.out.println(String.format("%10s", "Name : " + customerName));
        System.out.println(String.format("%10s", "Date of Play : " + dateOfPlay));
        System.out.println(String.format("%10s", "Time of Play : " + timeOfPlay));
        System.out.println(String.format("%10s", "Number of Hours to Play : " + numberOfHours));
        System.out.println(String.format("%10s", "Turf Type : " + turf.getTurfName()));
        System.out.println(String.format("%10s", "Total Bill : " + numberOfHours*turf.getTurfPrice()));

    }
}
