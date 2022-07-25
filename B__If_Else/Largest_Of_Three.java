package B__If_Else;
import java.util.Scanner;
public class Largest_Of_Three {
    public static void main(String[] args) {
        // enter 3 inputs and check which one is largest

        Scanner scan = new Scanner(System.in);
        System.out.print("enter a : ");
        int a = scan.nextInt();
        System.out.print("enter b : ");
        int b = scan.nextInt();
        System.out.print("enter c : ");
        int c = scan.nextInt();

        if (a >= b && a >= c){
            System.out.println("a is largest");
        } else if (b >= a && b >= c){
            System.out.println("b is largest");
        } else {
            System.out.println("c is largest");
        }
    }
}
