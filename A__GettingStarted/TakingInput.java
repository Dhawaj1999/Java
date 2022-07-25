package A__GettingStarted;

import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        // to take no. input
        System.out.print("enter no. : ");
        int n = scan.nextInt();
        System.out.println(n);

        // to take string input
        System.out.print("enter text : ");
        String c = scan.next();
        System.out.println(c);

        System.out.print("enter full name : ");
        String f = s.nextLine();
        System.out.println(f);




    }
}
