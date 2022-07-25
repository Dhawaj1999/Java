package H__Functions;

import java.util.Scanner;

public class Fibonacci_Member {
    public static boolean fibonacci(int n){
        int x = 0;
        int y = 1;
        int z = 0;

        if (n == 0 || n == 1){
            return true;
        }
        else {
            while (z <= n) {
                x = y;
                y = z;
                z = x + y;

                if (z == n) {
                    return true;
                }
            }
        }
        return false;
        }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        boolean x = fibonacci(n);
        System.out.println(x);
    }
}
