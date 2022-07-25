package A__GettingStarted;
import java.util.Scanner;
public class ConvertMinutesToYearsAndDays {
    public static void main(String[] args) {
        // convert minutes to years and days
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input minutes : ");
        long minute = sc.nextLong();

        long years = ((minute)/(60*24*365));
        long days = ((minute/60/24)%365);

        System.out.println(minute + " minutes is approx. " + years + " years" + " and " + days + " days");
    }
}
