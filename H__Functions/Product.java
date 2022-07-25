package H__Functions;

import java.util.Scanner;

public class Product {
    public static float product(int a, float b){
        float z = a * b;
        return z;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        float b = scan.nextInt();

        float total = product(a, b);
        System.out.println(total);
    }
}
