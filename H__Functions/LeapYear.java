package H__Functions;

import java.util.Scanner;

public class LeapYear {

    public static void leapYear(int year){
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("leap year");
        }
        else {
            System.out.println("not leap year");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a year : ");
        int year = scan.nextInt();

        leapYear(year);
    }

}
