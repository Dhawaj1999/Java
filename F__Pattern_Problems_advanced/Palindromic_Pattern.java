package F__Pattern_Problems_advanced;
import java.util.Scanner;
public class Palindromic_Pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i <= n; ++i){
            // space
            for (int space = 1; space <= n-i; ++space){
                System.out.print(" ");
            }
            // 1st part number
            for (int j = i; j <= 2*i-1 && j > 0; --j){
                System.out.print(j);
            }
            // 2nd part number
            for (int j = 2; j <= i; ++j){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
