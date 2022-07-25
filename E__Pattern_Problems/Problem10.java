package E__Pattern_Problems;
import java.util.Scanner;
public class Problem10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = n;

        while (i <= n && i > 0){
            int j = 1;
            while (j <= i && j > 0){
                System.out.print(i);
                ++j;
            }
            System.out.println();
            --i;
        }
    }
}
