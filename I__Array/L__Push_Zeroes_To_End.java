package I__Array;

import java.util.Scanner;

public class L__Push_Zeroes_To_End {
    public static void zeroes(int size){
        Scanner scan = new Scanner(System.in);

        int[] array = new int[size];

        System.out.print("enter array elements : ");

        for (int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }

        for (int i = 0; i < size; i++){
            if (array[i] != 0){
                System.out.print(array[i] + " ");
            }
        }

        for (int i = 0; i < size; i++){
            if (array[i] == 0){
                System.out.print(array[i] + " ");
            }
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int size = scan.nextInt();
        zeroes(size);
    }
}
