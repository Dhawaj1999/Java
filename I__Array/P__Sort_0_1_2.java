package I__Array;

import java.util.Scanner;

public class P__Sort_0_1_2 {
    public static void sort(int size) {
        Scanner scan = new Scanner(System.in);

        int[] array = new int[size];

        System.out.print("what are the array elements you want to input in array to sort them ? ");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }

        for (int i = 0; i < size; i++){
            if (array[i] == 0){
                System.out.print(array[i] + " ");
            }
        }

        for (int i = 0; i < size; i++){
            if (array[i] == 1){
                System.out.print(array[i] + " ");
            }
        }

        for (int i = 0; i < size; i++){
            if (array[i] == 2){
                System.out.print(array[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter array size : ");
        int size = scan.nextInt();
        sort(size);
    }
}
