package I__Array;

import java.util.Scanner;

public class Taking_input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] numbers = new int[size];

        // input
        for (int i = 0; i < size; ++i){
            numbers[i] = scan.nextInt();
        }

        // output
        for (int i = 0; i < size; ++i){
            System.out.print(numbers[i] + " ");
        }
    }
}
