package C__Loops1;
import java.util.Scanner;
public class Number_Sequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b;
        int counter = 0;
        boolean ans = true;

        for (int i = 1; i < n; ++i){
            b = scan.nextInt();
            if (b - a == 0){
                ans = false;
                break;
            }
            else if (b - a > 0 && counter == 0){
                counter = 1;
            }
            else if (b - a < 0 && counter == 1){
                ans = false;
                break;
            }
            else if (b - a < 0){
                counter = 0;
            }
            a = b;
        }
        System.out.println(ans);
    }
}
