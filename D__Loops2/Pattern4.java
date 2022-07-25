package D__Loops2;
import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = n; i <= n && i > 0; --i){
            for (int j = 1; j <= i; ++j){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
