package I__Array;

import java.util.Scanner;

public class K__Sort_0_1 {
    public static void sort(int size){
        Scanner s = new Scanner(System.in);
        int[] array = new int[size];

        System.out.print("please enter only o and 1 randomly in array to sort it : ");
        for (int i = 0; i < size; ++i){
            array[i] = s.nextInt();
        }

        for (int i = 0; i < size; ++i){
                if (array[i] == 0){
                    System.out.print(array[i] + " ");
            }
        }

        for (int i = 0; i < size; ++i){
                if (array[i] == 1){
                    System.out.print(array[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int size = scan.nextInt();
        sort(size);
    }
}
