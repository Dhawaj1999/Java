package B__If_Else;
import java.util.Scanner;
public class Triangle3 {
    public static void main(String[] args) {
        // enter 3 sides of triangle, check if it is isosceles, equilateral, scalene or right-angled

        Scanner scan = new Scanner(System.in);
        System.out.println("enter first side : ");
        double a = scan.nextDouble();
        System.out.println("enter second side : ");
        double b = scan.nextDouble();
        System.out.println("enter third side : ");
        double c = scan.nextDouble();

        if (a > 0 && b > 0 && c > 0){
            if (a == b && a != c || b == c && b != a || c == a && c != b){
                System.out.println("isosceles triangle");
                return;
            }
        } if (a > 0 && b > 0 && c > 0){
            if (a == b && a == c){
                System.out.println("equilateral triangle");
                return;
            }
        }
//        if (a > 0 && b > 0 && c > 0){
//            if (a != b && b != c && c != a) {
//                System.out.println("scalene triangle");
//            }
//        }
        if (a > 0 && b > 0 && c > 0){
            double a1 = a * a;
            double b1 = b * b;
            double c1 = c * c;
            if (a1 == b1 + c1 || b1 == a1 + c1 || c1 == a1 + b1){
                System.out.println("right-angled triangle");
            } else if (a1 != b1 + c1 || b1 != a1 + c1 || c1 != a1 + b1){
                System.out.println("not-right angled triangle");
            }
        } else {
            System.out.println("invalid input");
        }
    }
}
