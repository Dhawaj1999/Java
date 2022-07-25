package C__Loops1;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int rev = 0;

        while (n > 0){
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;

        }
        System.out.println(rev);
    }
}
