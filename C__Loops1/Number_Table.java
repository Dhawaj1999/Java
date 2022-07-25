package C__Loops1;

import java.util.Scanner;

public class Number_Table {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number to print table : ");
        int n = scan.nextInt();

        for (int i = 1; i <= 10; ++i){
            int multiply = n * i;
            System.out.println(n + " x " + i + " : " + multiply);
        }
    }
}
