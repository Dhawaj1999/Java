package B__If_Else;
import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {
        // enter a number and check if it's even or odd

        Scanner scan = new Scanner(System.in);
        System.out.print("enter a num : ");
        int num = scan.nextInt();

        if (num%2==0){
            System.out.println("input is even");
        } else {
            System.out.println("input is odd");
        }
    }
}
