package A__GettingStarted;

import java.util.Scanner;

public class Square_Root {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int s = (int) Math.sqrt(n);
        System.out.println(s);
    }
}
