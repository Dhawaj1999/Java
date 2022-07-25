package E__Pattern_Problems;
import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;

        while (i <= n){
            int j = 1;
            while (j <= n){
                System.out.print(n);
                ++j;
            }
            System.out.println();
            ++i;
        }
    }
}
