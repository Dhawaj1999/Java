package K__Strings_And_2D_Arrays;

import java.util.Scanner;

public class C__Print_Prefix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter string : ");
        String str = scan.next();

        for (int i = 0; i < str.length(); i++){
            System.out.println(str.substring(0,i+1));
        }
    }
}
