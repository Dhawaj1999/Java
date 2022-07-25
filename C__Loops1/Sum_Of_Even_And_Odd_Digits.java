package C__Loops1;
import java.util.Scanner;
public class Sum_Of_Even_And_Odd_Digits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int even = 0;
        int odd = 0;

        while (n > 0){
            int last = n % 10;
            if (last % 2 == 0){
                even += last;
            } else {
                odd += last;
            }
            n = n / 10;
        }
        System.out.println("sum of even : " + even);
        System.out.println("sum of odd : " + odd);
    }
}
