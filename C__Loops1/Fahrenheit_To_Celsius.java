package C__Loops1;

import java.util.Scanner;

public class Fahrenheit_To_Celsius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter start temp : ");
        double s = scan.nextDouble();
        System.out.print("enter end temp : ");
        double e = scan.nextDouble();
        System.out.print("enter step size : ");
        double st = scan.nextDouble();

        while (s <= e){
            double far = s;
            double c = (far - 32) * 5/9;
            System.out.println( s + " f : " + c + " c");
            s = s + st;
        }
    }
}
