package K__Strings_And_2D_Arrays;

import java.util.Scanner;

public class L__Remove_Consecutive_Duplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("string : ");
        String string = scan.next();

        String result = "";

        for (int i = 0; i < string.length(); i++){
            if (i < string.length()-1 && string.charAt(i) == string.charAt(i+1)) {
                continue;
            }
            else {
                result = result + string.charAt(i);
            }
        }
        System.out.print(result);
    }
}
