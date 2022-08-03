package I__Array;

import java.util.Scanner;

public class N__Second_Largest_In_Array {
    public static void secondLargest(int size){
        Scanner scan = new Scanner(System.in);

        int[] array = new int[size];

        System.out.print("enter array elements : ");

        // taking array input
        for (int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }

        // sorting array in descending order
        for (int i = 0; i < size; i++){
            for (int j = i+1; j < size; j++){
                int temp;
                if (array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        // printing second largest
        System.out.print(array[1]);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter array size : ");
        int size = scan.nextInt();
        secondLargest(size);
    }
}
