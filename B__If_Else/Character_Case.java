package B__If_Else;
import java.util.Scanner;
public class Character_Case {
    public static void main(String[] args) {
        // take a character as input and prints either 1, 0 or -1 according to the following rules.
        // 1, if the character is an uppercase alphabet (A - Z)
        // 0, if the character is a lowercase alphabet (a - z)
        // -1, if the character is not an alphabet

        Scanner scan = new Scanner(System.in);
        System.out.print("enter an english character either in upper case or lower case : ");
        char c = scan.next().charAt(0);

        if (c >= 'A' && c <= 'Z'){
            System.out.println("1");
        } else if (c >= 'a' && c <= 'z'){
            System.out.println("0");
        } else {
            System.out.println("-1");
        }
    }
}
