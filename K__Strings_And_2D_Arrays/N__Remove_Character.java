package K__Strings_And_2D_Arrays;

import java.util.Scanner;

public class N__Remove_Character {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a string : ");
        String s = scan.nextLine();
        System.out.print("character : ");
        String c = scan.next();

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == c.charAt(0)){
                continue;
            }
            else {
                System.out.print(s.charAt(i));
            }
        }
    }
}
