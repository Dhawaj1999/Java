package F__Pattern_Problems_advanced;
import java.util.Scanner;
public class Butterfly_Pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // Upper half
        for (int i = 1; i <= n; ++i){
            // 1st upper part
            for (int j = 1; j <= i; ++j){
                System.out.print("*");
            }
            // space
            for (int space = 1; space <= 2*(n-i); ++space){
                System.out.print(" ");
            }
            // 2nd upper part
            for (int j = 1; j <= i; ++j){
                System.out.print("*");
            }
            System.out.println();
        }

        // lower part
        for (int i = n; i >= 1; --i){
            // 1st lower part
            for (int j = 1; j <= i; ++j){
                System.out.print("*");
            }
            // space
            for (int space = 1; space <= 2*(n-i); ++space){
                System.out.print(" ");
            }
            // 2nd lower part
            for (int j = 1; j <= i; ++j){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
