package H__Functions;

import java.util.Scanner;

public class Sum {
    public static int sum(int x, int y){
        int z = x + y;
        return z;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        int add = sum(x, y);
        System.out.println(add);
    }
}
