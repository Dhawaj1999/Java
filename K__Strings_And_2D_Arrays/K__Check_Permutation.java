package K__Strings_And_2D_Arrays;

import java.util.Scanner;

public class K__Check_Permutation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("string 1 : ");
        String string1 = scan.next();
        System.out.print("string2 : ");
        String string2 = scan.next();

        int count = 0;

        for (int i = 0; i < string1.length(); i++){
            for (int j = 0; j < string2.length(); j++){
                if (string1.charAt(i) == string2.charAt(j)){
                    count++;
                }
            }
        }

        System.out.println(count == string1.length() && count == string2.length());
    }
}
