package E__Pattern_Problems;
import java.util.Scanner;
public class Problem7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        int val = 1;

        while (i <= n){
            int j = 1;
            while (j <= i){
                System.out.print((char)('A' + val - 1));
                ++val;
                ++j;
            }
            System.out.println();
            ++i;
        }
    }
}
