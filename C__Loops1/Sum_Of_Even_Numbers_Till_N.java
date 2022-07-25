package C__Loops1;

import java.util.Scanner;

public class Sum_Of_Even_Numbers_Till_N {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = scan.nextInt();
        int i = 2;
        int sum = 0;

        while (i <= n){
            sum = sum + i;
            i = i + 2;
        }
        System.out.println(sum);
    }
}
