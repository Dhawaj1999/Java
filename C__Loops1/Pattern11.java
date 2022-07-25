package C__Loops1;
import java.util.Scanner;
public class Pattern11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;

        while (i <= n){
            int space = 1;
            while (space <= n-i){
                System.out.print(" ");
                ++space;
            }
            int j = 1;
            int p = 1;
            while (j <= i){
                System.out.print(p);
                ++j;
                ++p;
            }
            j = 1;
            p = i-1;
            while (j <= i-1){
                System.out.print(p);
                ++j;
                --p;
            }
            System.out.println();
            ++i;
        }
    }
}
