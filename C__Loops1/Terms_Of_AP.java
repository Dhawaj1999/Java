package C__Loops1;

import java.util.Scanner;

public class Terms_Of_AP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int terms = scan.nextInt();
        int count = 1;

        for (int n = 1; count <= terms; ++n){
                    int series = 3 * n + 2;
                    if (series % 4 != 0) {
                        System.out.println(series);
                        ++count;
                    }
        }
    }
}
