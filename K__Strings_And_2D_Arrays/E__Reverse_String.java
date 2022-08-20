package K__Strings_And_2D_Arrays;

import java.util.Scanner;

public class E__Reverse_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter string : ");
        String str = scan.nextLine();

        int i = str.length()-1;
        int j,k;

        while (i >= 0){
            j = i;
            while (str.charAt(j) != ' ' && j > 0)
                j--;
            if (j == 0)
                k = 0;
            else
                k = j+1;
            while (k <= i){
                System.out.print(str.charAt(k));
                k++;
            }
            System.out.print(" ");
            i = j-1;
        }

    }
}
