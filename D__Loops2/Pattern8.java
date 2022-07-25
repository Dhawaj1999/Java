package D__Loops2;
import java.util.Scanner;
public class Pattern8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int val = 1;

        for (int i = 1; i <= n; ++i){
            for (int j = 1; j <= i; ++j){
                System.out.print(val);
                ++val;
            }
            System.out.println();
        }
    }
}
