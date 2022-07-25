package H__Functions;

import java.util.Scanner;

public class Prime_Or_Not_And_Print_Prime_Number {

    public static boolean isPrime(int n){
        for (int j = 2; j < n; ++j){
            if (n % j == 0){
                return false;
            }
        }
        return true;
    }

    public static void printPrimeNumber(int n){
        for (int i = 2; i < n; ++i){
            boolean prime = isPrime(i);
            if (prime){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printPrimeNumber(n);
    }
}
