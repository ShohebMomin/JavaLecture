package day5;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Your snacks");
        System.out.println("1: Burger");
        System.out.println("2: Fries");
        System.out.println("3: Cold Drink");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Burger");
                System.out.println("Veg/Non-Veg Burger");
                System.out.println("1: Veg");
                System.out.println("2: Non-veg");
                choice = sc.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("Veg Burger");
                        System.out.println("Choose your Burger Size");
                        System.out.println("1: Small");
                        System.out.println("2: Medium");
                        System.out.println("3: Large");
                        choice = sc.nextInt();
                        switch (choice){
                            case 1: System.out.println("Your Small Veg Burger will be serve to your table in 30min"); break;
                            case 2: System.out.println("Your Medium Veg Burger will be serve to your table in 30min"); break;
                            case 3: System.out.println("Your Large Veg Burger will be serve to your table in 30min"); break;
                        }
                        break;
                    case 2:
                        System.out.println("Non-Veg Burger");
                        System.out.println("Choose your Burger Size");
                        System.out.println("1: Small");
                        System.out.println("2: Medium");
                        System.out.println("3: Large");
                        choice = sc.nextInt();
                        switch (choice){
                            case 1: System.out.println("Your Small Non-Veg Burger will be serve to your table in 30min"); break;
                            case 2: System.out.println("Your Medium Non-Veg Burger will be serve to your table in 30min"); break;
                            case 3: System.out.println("Your Large Non-Veg Burger will be serve to your table in 30min"); break;
                            default:
                                System.out.println("Invalid Input!!!");
                        }
                        break;
                    default:
                        System.out.println("Invalid input!!");
                }
                break;
            case 2:
                System.out.println("Fries");
                System.out.println("Choose Fries Flavour");
                System.out.println("1: Cheesy Fries");
                System.out.println("2: Classic Salty Fries");
                choice = sc.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("Cheesy Fries");
                        System.out.println("Choose your Fries Size");
                        System.out.println("1: Small");
                        System.out.println("2: Medium");
                        System.out.println("3: Large");
                        choice = sc.nextInt();
                        switch (choice){
                            case 1: System.out.println("Your Small Cheesy Fries will be serve to your table in 15min"); break;
                            case 2: System.out.println("Your Medium Cheesy Fries will be serve to your table in 15min"); break;
                            case 3: System.out.println("Your Large Cheesy Fries will be serve to your table in 15min"); break;
                        }
                        break;
                    case 2:
                        System.out.println("Classic Salty Fries");
                        System.out.println("Choose your Fries Size");
                        System.out.println("1: Small");
                        System.out.println("2: Medium");
                        System.out.println("3: Large");
                        choice = sc.nextInt();
                        switch (choice){
                            case 1: System.out.println("Your Small Classic Salty Fries will be serve to your table in 15min"); break;
                            case 2: System.out.println("Your Medium Classic Salty Fries will be serve to your table in 15min"); break;
                            case 3: System.out.println("Your Large Classic Salty Fries will be serve to your table in 15min"); break;
                        }
                        break;
                    default:
                        System.out.println("Invalid input!!");
                }
                break;
            case 3:
                System.out.println("Cold Drink");
                System.out.println("Choose Your Cold Drinks");
                System.out.println("1: Coca Cola");
                System.out.println("2: Pepsi");
                choice = sc.nextInt();
                switch (choice){
                    case 1:

                        System.out.println("Choose Size of the Cup");
                        System.out.println("1: Small");
                        System.out.println("2: Medium");
                        System.out.println("3: Large");
                        choice = sc.nextInt();
                        switch (choice){
                            case 1:
                                System.out.println("Your Small Coca Cola Cold Drink will serve to your table in 5min");
                                break;
                            case 2:
                                System.out.println("Your Medium Coca Cola Cold Drink will serve to your table in 5min");
                                break;
                            case 3: System.out.println("Your Large Coca Cola Cold Drink will serve to your table in 5min");
                                break;
                            default:
                                System.out.println("Invalid Input!!!");
                        }
                        break;
                    case 2:
                        System.out.println("Your Pepsi Cold Drink will serve to your table in 5min");
                        System.out.println("Choose Size of the Cup");
                        System.out.println("1: Small");
                        System.out.println("2: Medium");
                        System.out.println("3: Large");
                        choice = sc.nextInt();
                        switch (choice){
                            case 1:
                                System.out.println("Your Small Pepsi Drink will serve to your table in 5min");
                                break;
                            case 2:
                                System.out.println("Your Medium Pepsi Cold Drink will serve to your table in 5min");
                                break;
                            case 3: System.out.println("Your Large Pepsi Cold Drink will serve to your table in 5min");
                                break;
                            default:
                                System.out.println("Invalid Input!!!");
                        }
                        break;
                    default:
                }
        }
    }
}
