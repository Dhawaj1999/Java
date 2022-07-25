package H__Functions;

import java.util.Scanner;

public class Temperature {
    // s is start value
    // e is end value
    // w is step size

    public static void temperature(int s, int e, int w){
        while (s <= e){
            int celsius = (int) ((s - 32) * (5.0/9.0));
            System.out.println(s + "  " + celsius);
            s = s + w;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int e = scan.nextInt();
        int w = scan.nextInt();
        
        temperature(s, e, w);
    }
}
