package B__If_Else;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        // enter 3 sides of triangle and if their sum is 180 then it is valid

        Scanner scan = new Scanner(System.in);
        System.out.println("enter 1st side of triangle : ");
        double a = scan.nextDouble();
        System.out.println("enter 2nd side of triangle : ");
        double b = scan.nextDouble();
        System.out.println("enter 3rd side of triangle : ");
        double c = scan.nextDouble();
        double sum = a + b + c;

        if (sum == 180){
            System.out.println("triangle is valid");
        } else {
            System.out.println("triangle is invalid");
        }
    }
}

