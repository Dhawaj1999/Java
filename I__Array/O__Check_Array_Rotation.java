package I__Array;

import java.util.Scanner;

public class O__Check_Array_Rotation {
    public static int rotation(int size){
        Scanner scan = new Scanner(System.in);

        int[] array = new int[size];

        System.out.print("enter array elements to check rotation : ");
        for (int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }

        // to check rotation I need to check if array[i] > array[j]
        for (int i = 0; i < size; i++){
            for (int j = i+1; j <= i+1 && j < size; j++){
                if (array[i] > array[j]){
                return j;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter array size : ");
        int size = scan.nextInt();
        int output = rotation(size);
        System.out.print(output);
    }
}
