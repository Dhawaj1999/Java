package G__Test1;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i <= n; ++i){
            for (int j = 1; j <= 9; ++j){
                    if (j == 5 || j == i) {
                        System.out.print("*");
                    } else if (i + j == 10){
                        System.out.print("*");
                    } else {
                        System.out.print("0");
                    }
            }
            System.out.println();
        }
    }
}
