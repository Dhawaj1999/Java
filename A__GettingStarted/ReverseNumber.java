package A__GettingStarted;

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("This program reverse a 5 digit number");
        Scanner sca = new Scanner(System.in);
        System.out.println("enter five digit number : ");
        int num = sca.nextInt();

        int d5 = num / 10000 % 10;
        int d4 = num / 1000 % 10;
        int d3 = num / 100 % 10;
        int d2 = num / 10 % 10;
        int d1 = num % 10;
        System.out.println(d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5);

    }
}
