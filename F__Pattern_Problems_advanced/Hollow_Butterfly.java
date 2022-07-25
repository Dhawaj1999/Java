package F__Pattern_Problems_advanced;
import java.util.Scanner;
public class Hollow_Butterfly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // upper half
        for (int i = 1; i <= n; ++i){
            // 1st half
            for (int j = 1; j <= i; ++j){
                if (i == 1 || j == 1 || j == i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // space
            for (int space = 1; space <= 2*(n-i); ++space){
                System.out.print(" ");
            }
            // 2nd half
            for (int j = 1; j <= i; ++j){
                if (i == 1 || j == 1 || j == i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // lower half
        for (int i = n; i <= n && i > 0; --i){
            // 1st half
            for (int j = 1; j <= i; ++j){
                if (i == 1 || j == 1 || j == i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // space
            for (int space = 1; space <= 2*(n-i); ++space){
                System.out.print(" ");
            }
            // 2nd half
            for (int j = 1; j <= i; ++j){
                if (i == 1 || j == 1 || j == i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}