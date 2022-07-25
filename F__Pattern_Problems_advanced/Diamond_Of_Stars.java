package F__Pattern_Problems_advanced;
import java.util.Scanner;
public class Diamond_Of_Stars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // upper half
        for (int i = 1; i <= n; ++i){
            // space
            for (int space = 1; space <= n-i; ++space){
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= 2*i-1; ++j){
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half
        for (int i = n; i <= n && i > 0; --i){
            // space
            for (int space = 1; space <= n-i; ++space){
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= 2*i-1; ++j){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
