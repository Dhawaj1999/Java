package F__Pattern_Problems_advanced;
import java.util.Scanner;
public class Inverted_Half_Pyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = 1;

        for (int i = n; i <= n && i > 0; --i){
            for (int j = 1; j <= i; ++j){
                System.out.print(k);
            }
            System.out.println();
            ++k;
        }
    }
}
