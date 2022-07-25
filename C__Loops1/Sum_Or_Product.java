package C__Loops1;

import java.util.Scanner;

public class Sum_Or_Product {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter number(n) : ");
        int n = scan.nextInt();
        System.out.print("enter a choice i.e. 1 or 2 : ");
        int c = scan.nextInt();

        if (c == 1){
            int sum = 0;
            for (int i = 1; i <= n; ++i){
                sum = sum + i;
            }
            System.out.println("your choice is 1 so the sum of numbers from 1 to n is " + sum);
        } else if (c == 2){
            long product = 1;
            for (int i = 1; i <= n; ++i){
                product = product * i;
            }
            System.out.println("your choice is 2 so the product of numbers from 1 to n is " + product);
        } else {
            System.out.println("-1");
        }
    }
}
