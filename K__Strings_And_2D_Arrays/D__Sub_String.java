package K__Strings_And_2D_Arrays;

import java.util.Scanner;

public class D__Sub_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("string : ");
        String str = scan.next();

        int count = str.length();
        System.out.println(count);

        for (int x = 0; x < count; x++) {
            for (int i = x; i < str.length(); i++) {
                System.out.println(str.substring(x, i + 1));
            }
        }
    }
}
