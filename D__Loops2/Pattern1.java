package D__Loops2;
import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        for (int i = 1; i <= n; ++i){
            for (int j = 1; j <= m; ++j){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
