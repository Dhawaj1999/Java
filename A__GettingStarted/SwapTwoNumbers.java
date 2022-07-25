package A__GettingStarted;

import java.util.Scanner;
public class SwapTwoNumbers {
    public static void main(String[] args) {
        System.out.println("This program swap two numbers i.e. 'a' & 'b' with each other ");
        Scanner s = new Scanner(System.in);
        System.out.print("enter a : ");
        int a = s.nextInt();

        System.out.print("enter b : ");
        int b = s.nextInt();

        int temp = a;

        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
