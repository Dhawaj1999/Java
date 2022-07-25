package E__Pattern_Problems;
import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;

        while (i <= n){
            int j = i;
            while (j <= i && j > 0){
                System.out.print(j);
                --j;
            }
            System.out.println();
            ++i;
        }
    }
}
