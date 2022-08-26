package K__Strings_And_2D_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class O__Highest_Occurring_Character {
    public static void main(String[] args) {

        // we will use ascii values in this solution

        Scanner scan = new Scanner(System.in);
        System.out.print("String = ");
        String str = scan.next();

        int[] arr = new int[127];

        for (int i = 0; i < str.length(); i++){
            arr[str.charAt(i)] = arr[str.charAt(i)]+1;
        }

        int max = -1;
        char c = ' ';

        for (int i = 0; i < str.length(); i++){
            if (max < arr[str.charAt(i)]){
                max = arr[str.charAt(i)];
                c = str.charAt(i);
            }
        }
        System.out.println(c + " " + max);
    }
}
