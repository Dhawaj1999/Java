package G__Test1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        while (n < 10){
            int d = n % 10;
            int p = d*d*d;
            if (p == n){
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            break;
        }
        while (n >= 10 && n < 100){
            int d1 = n / 10 % 10;
            int d2 = n % 10;
            int p1 = d1*d1*d1;
            int p2 = d2*d2*d2;
            int result = p1 + p2;
            if (result == n){
                System.out.println("true");
            } else {
                System.out.println("false");

            }
            break;
        }
        while (n >= 100 && n < 1000){
            int d1 = n / 100 % 10;
            int d2 = n / 10 % 10;
            int d3 = n % 10;
            int p1 = d1*d1*d1;
            int p2 = d2*d2*d2;
            int p3 = d3*d3*d3;
            int result = p1+p2+p3;
            if (result == n){
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            break;
        }
    }
}
