package B__If_Else;
import java.util.Scanner;
public class Leap_Year {
    public static void main(String[] args) {
        // enter input as a year to check if it is leap year or not

        Scanner scan = new Scanner(System.in);
        System.out.print("enter year : ");
        int year = scan.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                System.out.println("leap year");
        } else {
            System.out.println("not leap year");
        }
    }
}
