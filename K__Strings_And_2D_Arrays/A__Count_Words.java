package K__Strings_And_2D_Arrays;

import java.util.Scanner;

public class A__Count_Words {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("hi user, enter some words : ");
        String words = scan.nextLine();

        int count = 1;

        for (int i = 0; i < words.length(); i++){
                 if (words.charAt(i) == ' ' && words.charAt(i+1) != ' '){
                     count++;
                 }
        }
        System.out.println(count);
    }
}
