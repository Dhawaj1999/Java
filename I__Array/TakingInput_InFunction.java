package I__Array;

import java.util.Scanner;

public class TakingInput_InFunction {
    // for input
    public static int[] takeInput(){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; ++i){
            numbers[i] = scan.nextInt();
        }
        return numbers;
    }

    // for output
    public static void print(int[] numbers){
        int size = numbers.length;
        for (int i = 0; i < size; ++i){
            System.out.print(numbers[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = takeInput();
        print(array);
    }
}
