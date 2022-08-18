package K__Strings_And_2D_Arrays;

import java.util.Scanner;

public class Start_With_Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("hey, enter your name : ");
        String str = scan.next();

        // print string
        System.out.println(str);

        // print character at index
        System.out.println(str.charAt(2+1));

        // print length of string
        System.out.println("your name has " + str.length() + " characters");

        // print string from begin Index to end Index
        System.out.println(str.substring(1,3));

        // print string from begin Index till last
        System.out.println(str.substring(2));

        // check if it is true or not
        System.out.println(str.contains("waj"));

    }
}
