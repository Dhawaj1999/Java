package K__Strings_And_2D_Arrays;

import java.util.Scanner;

public class M__Reverse_Each_Word {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a sentence : ");
        String string = scan.nextLine();

        int i = 0;
        int j = i;

        while (i < string.length()){
            if (string.charAt(i) == ' '){
                int temp = i;
                while (temp >= j){
                    System.out.print(string.charAt(temp));
                    temp--;
                }
                j = i+1;
            }
            i++;
        }
        System.out.print(" ");

        if (i == string.length()){
            i = i-1;
            while (i >= j){
                System.out.print(string.charAt(i));
                i--;
            }
        }
    }
}
