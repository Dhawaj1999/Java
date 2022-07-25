package C__Loops1;
import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;

        while (i <= n){
            int j = n;
            while (j <= n && j > 0){
                System.out.print(j);
                --j;
            }
            System.out.println();
            ++i;
        }
    }
}
