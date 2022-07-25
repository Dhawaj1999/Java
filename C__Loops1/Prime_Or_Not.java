package C__Loops1;

import java.util.Scanner;

public class Prime_Or_Not {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = scan.nextInt();
        int i = 2;

        while (i < n){
            if (n % i == 0){
                System.out.println("not prime");
                return;
            }
            i = i + 1;
        }
        System.out.println("prime");

    }
}
