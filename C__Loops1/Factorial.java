package C__Loops1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        int factr = 1;

        for (i = 1; i <= n; ++i){
            factr = factr * i;
        }
        System.out.println(factr);
    }
}
