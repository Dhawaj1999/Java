package B__If_Else;
import java.util.Scanner;
public class Area_Of_Rectangle_Is_Greater_Or_Perimeter {
    public static void main(String[] args) {
        // enter l and b of rectangle and calculate area & perimeter and check which is larger

        Scanner scan = new Scanner(System.in);
        System.out.print("enter length of rectangle : ");
        double a = scan.nextDouble();
        System.out.print("enter width of rectangle : ");
        double p = scan.nextDouble();
        double area = (a * p);
        double perimeter = 2 * (a + p);
        System.out.println("area of rectangle : " + area);
        System.out.println("perimeter of rectangle : " + perimeter);

        if (area > perimeter){
            System.out.println("area of rectangle is larger");
        } else {
            System.out.println("perimeter of rectangle is larger");
        }
    }
}
