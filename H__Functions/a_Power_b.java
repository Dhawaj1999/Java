package H__Functions;

import java.util.Scanner;

public class a_Power_b {

    public static int power(int a, int b){
        int c = 1;
        while (b > 0){
            c = c * a;
            --b;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int total = power(a, b);
        System.out.println(total);
    }
}
