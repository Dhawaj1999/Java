package B__If_Else;
import java.util.Scanner;
public class Int_To_String {
    public static void main(String[] args) {
        // enter a number from 1-3 and print its String

        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number between 1- 3 : ");
        int a = scan.nextInt();

        if (a == 1){
            System.out.println("one");
        } else if (a == 2){
            System.out.println("two");
        } else if (a == 3){
            System.out.println("three");
        } else {
            System.out.println("Input is out of 1-3 range");
        }

    }
}
