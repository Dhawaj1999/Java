package K__Strings_And_2D_Arrays;

import java.util.Scanner;

public class E__Reverse_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter string : ");
        String str = scan.nextLine();

        int i = str.length()-1;
        int j = str.length()-1;

        while (i >= 0){
            if (str.charAt(i) == ' '){
                int k = i+1;
                while (k <= j){
                    System.out.print(str.charAt(k));
                    k++;
                }
                System.out.print(" ");
                j = i-1;
            }
            i--;
        }
        int k = i+1;
        while (k <= j){
            System.out.print(str.charAt(k));
            k++;
        }
    }
}
