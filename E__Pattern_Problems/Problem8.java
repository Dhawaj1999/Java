package E__Pattern_Problems;
import java.util.Scanner;
public class Problem8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;

        while (i <= n){
            int j = 1;
            char c = (char)('A' + n - i);
            while (j <= i){
                System.out.print((char)(c + j - 1));
                ++j;
            }
            System.out.println();
            ++i;
        }
    }
}
