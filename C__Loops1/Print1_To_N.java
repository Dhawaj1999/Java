package C__Loops1;

import java.util.Scanner;

public class Print1_To_N {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = scan.nextInt();
        int i = 1;

        while (i <= n){
            System.out.print(i + " ");
            i++;
        }
    }
}
