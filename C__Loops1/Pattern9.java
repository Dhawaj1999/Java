package C__Loops1;
import java.util.Scanner;
public class Pattern9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;

        while (i <= n){
            int j = 1;
            int k = i;
            while (j <= n){
                System.out.print((char)('A' + k - 1));
                ++k;
                ++j;
            }
            System.out.println();
            ++i;
        }
    }
}
