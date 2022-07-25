package F__Pattern_Problems_advanced;
import java.util.Scanner;
public class Hollow_Rhombus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i <= n; ++i){
            // space
            for (int space = 1; space <= n-i; ++space){
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= n; ++j){
                if (i == 1 || j == 1 || i == n || j == n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
