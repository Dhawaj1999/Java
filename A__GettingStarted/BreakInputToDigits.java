package A__GettingStarted;
import java.util.Scanner;
public class BreakInputToDigits {
    public static void main(String[] args) {
        // take an input of 5 digits and print digits individual
        Scanner scn = new Scanner(System.in);
        System.out.print("enter 5 digit no. = ");
        int number = scn.nextInt();

        int d1 = number / 10000 % 10;
        int d2 = number / 1000 % 10;
        int d3 = number / 100 % 10;
        int d4 = number / 10 % 10;
        int d5 = number % 10;

        System.out.println(d1 + " " + d2 + " " + d3 + " " + d4 + " " +d5);
    }
}
