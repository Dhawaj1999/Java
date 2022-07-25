package H__Functions;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int number){
        int fact = 1;
        for (int i = 1; i <= number; ++i){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int factorial = factorial(5);
        System.out.println(factorial);
    }
}
