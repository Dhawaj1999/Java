package B__If_Else;
import java.util.Scanner;
public class Roots_Of_Quadratic_Equation {
    public static void main(String[] args) {
        // find roots of a quadratic equation

        Scanner scan = new Scanner(System.in);
        System.out.print("enter a : ");
        double a = scan.nextDouble();
        System.out.print("enter b : ");
        double b = scan.nextDouble();
        System.out.print("enter c : ");
        double c = scan.nextDouble();

        double detr = b * b - 4 * a * c;
        double root1, root2;

        if (detr > 0){
            root1 = (-b + Math.sqrt(detr)) / (2 * a);
            root2 = (-b - Math.sqrt(detr)) / (2 * a);
            System.out.println("root1 : " + root1 + " " + " root2 : " + root2);
        } else if (detr == 0){
            root1 = root2 = -b/(2*a);
            System.out.println("root1 = root2 : " + root1);
        } else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-detr) / (2 * a);
            System.out.println("root1 = " + real + " " + imaginary);
            System.out.println("root2 = " + real + " " + imaginary);
        }

    }
}
