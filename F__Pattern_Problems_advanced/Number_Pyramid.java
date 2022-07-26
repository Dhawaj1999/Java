package F__Pattern_Problems_advanced;
import java.util.Scanner;
public class Number_Pyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i <= n; ++i){
            // space
            for (int space = 1; space <= n-i; ++space){
                System.out.print(" ");
            }
            // number
            for (int j = 1; j <= i; ++j){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
