package J__Searching_And_Sorting;

import java.util.Scanner;

public class D__Insertion_Sort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("array size : ");
        int size = scan.nextInt();
        int[] array = new int[size];

        System.out.print("array elements : ");
        for (int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }

        for (int i = 1; i < size; i++){
            int temp = array[i];
            int j = i-1;
            while (j >= 0 && array[j] > temp){
                 array[j+1] = array[j];
                 array[j] = temp;
                 j--;
            }
        }

        for (int val : array){
            System.out.print(val + " ");
        }
    }
}
