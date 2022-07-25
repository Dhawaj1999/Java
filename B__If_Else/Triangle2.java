package B__If_Else;
import java.util.Scanner;
public class Triangle2 {
    public static void main(String[] args) {
        // enter 3 sides of triangle and if sum of two side is greater than third, it is valid


        Scanner scan = new Scanner(System.in);
        System.out.print("enter 1st side of triangle : ");
        double a = scan.nextDouble();
        System.out.print("enter 2nd side of triangle : ");
        double b = scan.nextDouble();
        System.out.print("enter 3rd side of triangle : ");
        double c = scan.nextDouble();

        if ((a + b > c) || (b + c > a) || (a + c > b)){
            System.out.println("valid triangle");
        } else {
            System.out.println("invalid triangle");
        }

    }
}
