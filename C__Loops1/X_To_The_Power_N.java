package C__Loops1;
import java.util.Scanner;
public class X_To_The_Power_N {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        int total = 1;

        for (total = 1; n > 0; --n){
            total *= x;
        }
        System.out.println(total);
    }
}
