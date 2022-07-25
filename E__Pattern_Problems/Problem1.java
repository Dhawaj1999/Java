package E__Pattern_Problems;
import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        while (i <= n){
            int j = 1;
            int k = i;
            while (j <= i){
                System.out.print(k);
                ++k;
                ++j;
            }
            System.out.println();
            ++i;
        }
    }
}
